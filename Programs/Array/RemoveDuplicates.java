package Array;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 5, 6};
        System.out.println(Arrays.toString(arr));
        int ans = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1 ; j < nums.length ; j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}
