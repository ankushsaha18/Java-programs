package String;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,2,5,6,1,1,1,0,2,5};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                int temp = 0;
                while(i < nums.length && nums[i] == 1){
                    temp++;
                    i++;
                }
                if(temp > ans){
                    ans = temp;
                }
            }
        }
        return ans;
    }
}
