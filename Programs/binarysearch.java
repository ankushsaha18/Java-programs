public class binarysearch {
    public static int bsrch(int[] arr, int x) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
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

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 8, 44, 97 };
        int x = 97;
        System.out.println("Element " + x + " found at index " + bsrch(arr, x));
    }
}
