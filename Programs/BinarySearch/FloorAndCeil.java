package BinarySearch;

import java.util.Arrays;

public class FloorAndCeil {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 8, 10, 14 };
        System.out.println(Arrays.toString(getFloorAndCeil(arr,8)));
    }
    public static int[] getFloorAndCeil(int[] nums, int x) {
        int floor = floor(nums,x);
        int ceil = ceiling(nums,x);
        return new int[]{floor,ceil};
    }
    public static int floor(int[] nums, int target) {
        int ans = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int m = left + (right - left)/2;
            if(nums[m] <= target){
                ans = nums[m];
                left = m + 1;
            }else {
                right = m - 1;
            }
        }
        return ans;
    }
    public static int ceiling(int[] nums, int target) {
        int ans = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int m = left + (right - left)/2;
            if(nums[m] >= target){
                ans = nums[m];
                right = m - 1;
            }else {
                left = m + 1;
            }
        }
        return ans;
    }
}
