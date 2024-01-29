import java.util.Arrays;

public class BinarySearch2DArray {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        System.out.println(Arrays.toString(binary2Dsearch(matrix, 7)));
    }

    public static int[] binary2Dsearch(int[][] matrix, int target) {
        int i = 0, j = ((matrix.length) * (matrix[0].length) - 1);
        while (i <= j) {
            int m = i + (j - i) / 2;
            int row = m / matrix[0].length;
            int col = m % matrix[0].length;
            if (matrix[row][col] == target) {
                return new int[] { row, col };
            } else if (matrix[row][col] > target) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return new int[] { -1, -1 };
    }
}
