package BinarySearch;

public class FindUpperBound {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        System.out.println(upperBound(arr,1));
    }
    public static int upperBound(int[] nums, int x) {
        int ans = nums.length;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int m = left + (right - left)/2;
            if(nums[m] > x){
                ans = m;
                right = m - 1;
            }else {
                left = m + 1;
            }
        }
        return ans;
    }
}
