import java.util.Arrays;

//time complexity O(n)
public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 28, 29, 37, 49 }, { 33, 34, 48, 50 } };
        System.out.println(Arrays.toString(searchElement(arr, 10)));
    }

    public static int[] searchElement(int[][] arr, int target) {
        int i = 0, j = arr[0].length - 1;
        while (i < arr.length && j >= 0) {
            if (arr[i][j] == target) {
                return new int[] { i, j };
            } else if (arr[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] { -1, -1 };
    }
}
