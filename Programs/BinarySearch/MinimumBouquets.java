package BinarySearch;

public class MinimumBouquets {
    public static void main(String[] args) {
        int[] nums = {7, 7, 7, 7, 13, 11, 12, 7};
        System.out.println(roseGarden(8,nums,2,3));
    }
    public static int roseGarden(int n, int[] nums, int k, int m) {
        long roses = (long) k*m;
        if(roses > n){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int min = 1;
        for(int i : nums){
            max = Math.max(max,i);
        }
        int ans = -1;
        while (min <= max){
            int mid = min + (max - min)/2;
            if(possible(nums,k,m,mid)){
                ans = mid;
                // try if possible in lesser day
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return ans;
    }
    private static boolean possible(int[] nums,int k,int m,int day){
        int cnt = 0;
        for (int num : nums) {
            if (num <= day) {
                cnt++;
                if(cnt == k){
                    cnt = 0;
                    // Decrease a bouquet as reached flower limit
                    // check if all bouquet completed
                    if(--m == 0){
                        return true;
                    }
                }
            } else {
                cnt = 0;
            }
        }
        return false;
    }
}
