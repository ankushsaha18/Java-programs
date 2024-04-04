package Recursion;

public class recBinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 9;
        System.out.println(bSearch(arr, target, 0, arr.length - 1));
    }

    public static int bSearch(int arr[], int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return bSearch(arr, target, start, mid);
        } else {
            return bSearch(arr, target, mid + 1, end);
        }

    }
}
