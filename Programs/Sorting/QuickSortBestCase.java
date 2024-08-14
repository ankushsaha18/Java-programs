package Sorting;
import java.util.Arrays;


// For worst case its time complexity is better
// But it doesn't works for large inputs

public class QuickSortBestCase {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};
        System.out.println(Arrays.toString(arr));
        quick(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick(int[] arr,int low,int high){
        if(low >= high){
            return;
        }
        int pivot = low + (high - low)/2;
        int i = low;
        int j = high;
        while(arr[i] < arr[pivot]){
            i++;
        }
        while (arr[j] > arr[pivot]){
            j--;
        }
        if(i <= j){
            swap(arr,i,j);
            i++;
            j--;
        }
        quick(arr,low,j);
        quick(arr,i,high);
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
