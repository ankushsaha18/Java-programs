package Array;
import java.util.Arrays;

public class KadanesAlgorithm2 {
    // Here we have to return the starting and ending indexes of the subarray we are calculating
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        System.out.println(Arrays.toString(maxSubArray(nums)));
    }
    public static int[] maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        int point = 0;
        int start = -1;
        int end = -1;
        for(int i = 0 ; i < nums.length ; i++){
            // Store the point from where new sum is calculated
            if(sum == 0){
                point = i;
            }
            sum += nums[i];
            if(sum > max){
                max = sum;
                start = point;
                end = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return new int[]{start,end};
    }
}
