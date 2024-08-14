package Sorting;
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
        int partIndex = partition(arr,low,high);
        quick(arr,low,partIndex-1);
        quick(arr,partIndex+1,high);
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = low;
        int i = low;
        int j = high;
        while(i < j){
            while(arr[i] <= arr[pivot] && i < high){
                i++;
            }
            while (arr[j] > arr[pivot] && j > low){
                j--;
            }
            if(i < j){
                swap(arr,i,j);
            }
        }
        swap(arr,pivot,j);
        return j;
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
