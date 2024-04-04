package Logic;

public class CeilingArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 8, 10, 14 };
        System.out.println(floor(arr, 1));
    }

    public static int ceiling(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (target > arr[mid]) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return arr[i];
    }

    public static int floor(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (target > arr[mid]) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        if (target != arr[j] && (j - 1) > 0) {
            return arr[j - 1];
        }
        return arr[j];
    }
}
