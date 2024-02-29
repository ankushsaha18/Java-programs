import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 0 };
        cycleSort0Index(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cycleSort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; // arr[i]-1 as it starts from 1 so index will be 1 less
            if (arr[i] == arr[correct]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
        }
    }

    public static void cycleSort0Index(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] == arr[correct]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
        }
    }
}
