import java.util.*;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = { 7, 22, 36, 0, 9, 2 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }
            int swap = arr[small];
            arr[small] = arr[i];
            arr[i] = swap;
        }
    }

}
