package Recursion.Backtracking;
import java.util.ArrayList;
import java.util.List;

public class SubsetsI {
    public static void main(String[] args) {
        int[] nums = {2,3};
        System.out.println(subsetSums(nums));
    }
    public static List<Integer> subsetSums(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        function(0,0,ans,nums);
        return ans;
    }
    public static void function(int index,int sum,List<Integer> ans,int[] nums){
        if(index == nums.length){
            ans.add(sum);
            return;
        }
        function(index+1,sum,ans,nums);
        function(index+1,sum+nums[index],ans,nums);
    }
}
