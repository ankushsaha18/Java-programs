import java.util.*;

public class insertionsort {
    public static void main(String[] args) {
        int arr[] = { 8, 9, 2, 4, 7 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }
    }

}
