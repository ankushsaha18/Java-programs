package BitManipulation.Questions;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,5,5};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i : nums){
            ans ^= i;
        }
        return ans;
    }
}
