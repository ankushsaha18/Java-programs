package BinarySearch;
import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        System.out.println(Arrays.toString(searchRange(arr,8)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int low = low(nums,target);
        int high = high(nums,target);
        return new int[]{low,high};
    }
    public static int low(int[] nums, int target) {
        int ans = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int m = left + (right - left)/2;
            if(nums[m] == target){
                ans = m;
                right = m - 1;
            }else if(nums[m] < target){
                left = m + 1;
            }else {
                right = m - 1;
            }
        }
        return ans;
    }
    public static int high(int[] nums, int target) {
        int ans = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int m = left + (right - left)/2;
            if(nums[m] == target){
                ans = m;
                left = m + 1;
            }else if(nums[m] > target){
                right = m - 1;
            }else {
                left = m + 1;
            }
        }
        return ans;
    }
}
