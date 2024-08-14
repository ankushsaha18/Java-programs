package Array;
import java.util.Arrays;

public class ArrayRotateLeft {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotateArray(arr,20);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
    }
    public static void reverse(int[] arr,int s,int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
