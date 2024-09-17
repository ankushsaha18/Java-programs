package Array;

import java.util.Arrays;

public class SortArray012 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 0};
        sortZeroOneTwo(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortZeroOneTwo(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int num : nums){
            if(num == 0){
                zero++;
            }
            else if(num == 1){
                one++;
            }
            else{
                two++;
            }
        }
        int i = 0;
        while (zero > 0){
            nums[i++] = 0;
            zero--;
        }
        while (one > 0){
            nums[i++] = 1;
            one--;
        }
        while (two > 0){
            nums[i++] = 2;
            two--;
        }
    }
}
