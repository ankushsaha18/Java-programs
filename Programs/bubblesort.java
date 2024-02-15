import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 8, 9, 7, 5, 1 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

}
