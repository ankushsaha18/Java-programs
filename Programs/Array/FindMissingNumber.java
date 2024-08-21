package Array;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,2,5,4};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0 ; i < nums.length ; i++){
            xor1 ^= (i+1);
            xor2 ^= nums[i];
        }
        return xor1^xor2;
    }
}
