package Recursion.General;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    public static int[] reverse(int[] arr) {
        rev(arr,0,arr.length - 1);
        return arr;
    }
    private static void rev(int[] arr,int left,int right){
        if(left >= right){
            return;
        }
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
        rev(arr,left+1,right-1);
    }
}
