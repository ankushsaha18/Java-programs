package Array;

import java.util.Arrays;

public class SubArraySort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,6,7,4,20,30};
        System.out.println(check(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static boolean check(int[] arr){
        int start = -1;
        for (int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] > arr[i+1]){
                start = i;
                break;
            }
        }
        int end = -1;
        for (int i = arr.length-1 ; i > 0 ; i--){
            if(arr[i] < arr[i-1]){
                end = i;
                break;
            }
        }
        reverse(arr,start,end);
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void reverse(int[] arr,int start,int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
