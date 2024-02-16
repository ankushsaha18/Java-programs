import java.util.*;

public class searchmatrix {
    public static void main(String args[]) {
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 28, 29, 37, 49 }, { 33, 34, 48, 50 } };
        System.out.println(Arrays.toString(normalSearch(arr, 15)));

    }

    public static int[] normalSearch(int[][] matrix, int x) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == x) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

}
