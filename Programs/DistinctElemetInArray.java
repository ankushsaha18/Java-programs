import java.util.Arrays;

public class DistinctElemetInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 1, 2, 5, 3, 3, 8, 7, 9 };
        System.out.println(Arrays.toString(distinctElements(arr)));
    }

    public static int[] distinctElements(int[] arr) {
        int temp[] = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                temp[count++] = arr[i];
            }
        }
        int ans[] = new int[count];
        for (int i = 0; i < count; i++) {
            ans[i] = temp[i];
        }
        return ans;
    }
}
