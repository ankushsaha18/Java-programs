package Discrete;

public class NewtonRapson {
    public static void main(String[] args) {
        System.out.println(sqrt(4));
    }

    public static double sqrt(int n) {
        double x = n;
        while (true) {
            double root = 0.5 * (x + n / x);
            if (Math.abs(root - x) < 0.1) {
                return root;
            }
            x = root;
        }
    }
}
