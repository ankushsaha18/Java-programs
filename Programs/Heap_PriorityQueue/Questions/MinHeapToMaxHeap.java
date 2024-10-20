package Heap_PriorityQueue.Questions;
import java.util.Arrays;

public class MinHeapToMaxHeap {
    public static void main(String[] args) {
        int[] nums = {-5, -4, -3, -2, -1};
        System.out.println(Arrays.toString(minToMaxHeap(nums)));
    }
    public static int[] minToMaxHeap(int[] nums) {
        int n = nums.length;
        for(int i = n/2 ; i >= 0 ; i--){
            heapify(nums,n,i);
        }
        return nums;
    }
    public static void heapify(int[] a,int n,int i){
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l < n && a[largest] < a[l]){
            largest = l;
        }
        if(r < n && a[largest] < a[r]){
            largest = r;
        }
        if(largest != i){
            swap(a,i,largest);
            heapify(a,n,largest);
        }
    }
    private static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
