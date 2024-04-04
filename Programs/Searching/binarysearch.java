package Searching;

public class binarysearch {
    public static int binarySearchAsc(int[] arr, int x) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (x > arr[mid]) {
                i = mid + 1;
            } else if (x < arr[mid]) {
                j = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearchDesc(int[] arr, int x) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (x > arr[mid]) {
                j = mid;
            } else if (x < arr[mid]) {
                i = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 97, 45, 34, 21, 10, 8, 5, 3, 1 };
        int x = 10;
        System.out.println("Element " + x + " found at index " + binarySearchDesc(arr, x));
    }
}
