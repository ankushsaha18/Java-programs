package Sorting;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,2,8,9,4,6,7,1,6,4};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] nums,int low,int high) {
        if(low >= high){
            return;
        }
        int m = low + (high - low)/2;
        mergeSort(nums,low,m);
        mergeSort(nums,m+1,high);
        merge(nums,low,m,high);
    }
    public static void merge(int[] nums,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int index = 0;
        int i = low;
        int j = mid+1;
        while (i <= mid && j <= high){
            if(nums[i] < nums[j]){
                temp[index++] = nums[i++];
            }else{
                temp[index++] = nums[j++];
            }
        }
        while (i <= mid){
            temp[index++] = nums[i++];
        }
        while (j <= high){
            temp[index++] = nums[j++];
        }
        for(int k = low ; k <= high ; k++){
            nums[k] = temp[k-low];
        }
    }
}
