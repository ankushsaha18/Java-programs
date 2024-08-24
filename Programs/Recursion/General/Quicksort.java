package Recursion.General;
import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,9,8,2};
        System.out.println(Arrays.toString(arr));
        quick(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick(int[] arr,int low,int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = arr[m];

        while (arr[s] < pivot){
            s++;
        }
        while (arr[e] > pivot){
            e--;
        }
        if(s <= e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        quick(arr,low,e);
        quick(arr,s,high);
    }
}
