package Logic;

public class pascalTriangle {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ncr(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int ncr(int n, int r) {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
