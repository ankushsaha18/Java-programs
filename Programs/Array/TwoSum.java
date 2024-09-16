package Array;
import java.util.Arrays;
import java.util.Comparator;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, -7, 6, -3};
        int target = 0;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 1 ; i < nums.length ; i++){
            for(int j = i ; j < nums.length ; j++){
                if(nums[j-i] + nums[j] == target){
                    return new int[]{j-i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
