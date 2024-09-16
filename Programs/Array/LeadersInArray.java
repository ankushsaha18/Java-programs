package Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};
        System.out.println(Arrays.toString(leaders(nums)));
    }
    public static int[] leaders(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(nums[n-1]);
        int max = nums[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            if(nums[i] > max){
                lst.add(nums[i]);
                max = nums[i];
            }
        }
        n = lst.size();
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++){
            ans[n-i-1] = lst.get(i);
        }
        return ans;
    }
}
