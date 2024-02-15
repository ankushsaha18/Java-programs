import java.util.Arrays;

public class Q9a {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 4, 7, 8 };
        System.out.println(Arrays.toString(insertElement(arr, 3, 10)));
    }

    public static int[] insertElement(int[] arr, int pos, int element) {
        int ans[] = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            ans[i] = arr[i];
        }
        ans[pos] = element;
        for (int i = pos + 1; i <= arr.length; i++) {
            ans[i] = arr[i - 1];
        }
        return ans;
    }
}
