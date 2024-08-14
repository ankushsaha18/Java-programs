package Sorting;

public class checkSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,40,5,6,7,8};
        System.out.println(checkSorted(arr,0));
    }
    public static boolean checkSorted(int[] arr,int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return checkSorted(arr,i+1);
    }
}
