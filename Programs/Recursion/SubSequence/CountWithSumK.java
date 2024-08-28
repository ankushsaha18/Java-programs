package Recursion.SubSequence;

public class CountWithSumK {
    public static void main(String[] args) {
        int[] nums = {4, 9, 2, 5, 1};
        System.out.println(countSubsequenceWithTargetSum(nums,10));
    }
    public static int countSubsequenceWithTargetSum(int[] nums, int k) {
        return function(0,k,nums);
    }
    public static int function(int index,int sum,int[] nums){
        if(sum == 0){ // if sum is 0 means the sum of the elements form k
            return 1;
        }
        if(sum < 0 || index >= nums.length){ // as we are doing minus so if its negative its false
            return 0;
        }
        int left = function(index+1,sum - nums[index],nums);  // here we will take the sum of the element
        int right = function(index+1,sum,nums); // here we will skip the element
        return left + right;
    }
}
