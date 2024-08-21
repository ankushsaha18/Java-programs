package BinarySearch;

public class FindLowerBound {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,8,10,11,19};
        System.out.println(lowerBound(arr,6));
    }
    public static int lowerBound(int[] nums, int x) {
        int ans = nums.length;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int m = left + (right - left)/2;
            if(nums[m] >= x){
                ans = m;
                right = m - 1;
            }else {
                left = m + 1;
            }
        }
        return ans;
    }
}