package BinarySearch;

public class binarysearch {
    public static void main(String[] args) {
        int arr[] = { 97, 45, 34, 21, 10, 8, 5, 3, 1 };
        int x = 101;
        System.out.println(binarySearchDesc(arr, x));
    }
    public static int binarySearchAsc(int[] arr, int x) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if(arr[mid] == x){
                return mid;
            } else if (x > arr[mid]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchDesc(int[] arr, int x) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if(arr[mid] == x){
                return mid;
            } else if (x > arr[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }
}
