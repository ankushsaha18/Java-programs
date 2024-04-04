package Logic;

import java.util.*;

public class SpiralTraversalMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(SpiralMatrix(matrix));
    }

    public static ArrayList<Integer> SpiralMatrix(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = n - 1;
        int top = 0, bot = m - 1;
        while (left <= right || top <= bot) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bot; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            for (int i = right; i >= left; i--) {
                ans.add(matrix[bot][i]);
            }
            bot--;
            for (int i = bot; i >= top; i--) {
                ans.add(matrix[i][left]);
            }
            left++;
        }
        return ans;
    }
}
