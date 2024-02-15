import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 1, 2 };
        bubble(arr);

    }

    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
