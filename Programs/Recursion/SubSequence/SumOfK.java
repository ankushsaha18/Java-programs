package Recursion.SubSequence;

public class SumOfK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(checkSubsequenceSum(nums,8));
    }
    public static boolean checkSubsequenceSum(int[] nums, int k) {
        return function(0,k,nums);
    }
    public static boolean function(int index,int sum,int[] nums){
        if(sum == 0){ // if sum is 0 means the sum of the elements form k
            return true;
        }
        if(sum < 0 || index >= nums.length){ // as we are doing minus so if its negative its false
            return false;
        }
        boolean left = function(index+1,sum - nums[index],nums);  // here we will take the sum of the element
        boolean right = function(index+1,sum,nums); // here we will skip the element
        return left || right; // if any of the path is true answer is true
    }
}
