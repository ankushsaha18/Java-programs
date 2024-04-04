package Pattern;

public class NumberConverge {
    public static void main(String[] args) {
        int rows = 4;
        int n = 2 * rows - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int el = rows - Math.min(Math.min(i, j), Math.min(n - i - 1, n - j - 1));
                /*
                 * minimum distance
                 * from all 4 sides
                 * in that matrix
                 */
                System.out.print(el);
            }
            System.out.println();
        }
    }
}
