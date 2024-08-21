package LogicAndMath;

public class FloorArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 8, 10, 14 };
        System.out.println(floor(arr,1));
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
}
