package Array;

public class SmallestDivisor {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(smallestDivisor(nums,8));
    }
    public static int smallestDivisor(int[] nums, int limit) {
        if(nums.length > limit){
            return -1;
        }
        int max = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            max = Math.max(max,nums[i]);
        }
        int low = 1;
        int high = max;
        while (low <= high){
            int mid = low + (high-low)/2;
            int sum = sumCal(nums,mid);
            // operation of high and low opposite
            // as we have to divide as high the number as low the sum
            if(sum <= limit){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    private static int sumCal(int[] nums,int lim){
        int sum = 0;
        for (int num : nums) {
            // ceiling calculate
            sum += (num + lim - 1) / lim;
        }
        return sum;
    }
}