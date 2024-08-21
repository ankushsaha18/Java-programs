package LogicAndMath;

public class CeilingArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 8, 10, 14 };
        System.out.println(ceiling(arr,9));
    }
    public static int ceiling(int[] nums, int target) {
        int ans = nums.length;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int m = left + (right - left)/2;
            if(nums[m] >= target){
                ans = m;
                right = m - 1;
            }else {
                left = m + 1;
            }
        }
        return nums[ans];
    }
}
