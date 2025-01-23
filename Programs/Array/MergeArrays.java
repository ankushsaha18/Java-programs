package Array;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,30,41};
        int[] arr2 = {8,9,15,17};
        int[] arr = merge(arr1,arr2);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] merge(int[] arr1,int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        int l = 0;
        int r = 0;
        int i = 0;
        while (l < arr1.length && r < arr2.length){
            if(arr1[l] <= arr2[r]){
                arr[i++] = arr1[l++];
            }else{
                arr[i++] = arr2[r++];
            }
        }
        while (l < arr1.length){
            arr[i++] = arr1[l++];
        }
        while (r < arr2.length){
            arr[i++] = arr2[r++];
        }
        return arr;
    }
}
