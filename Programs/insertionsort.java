import java.util.*;

public class insertionsort {
    public static void main(String[] args) {
        int arr[] = { 8, 9, 2, 4, 7 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j = i; // it will sort before part of that array
            while (j > 0 && arr[j - 1] > arr[j]) { // we have to find where it is decreasing
                int temp = arr[j - 1]; // swapping the value
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

}
