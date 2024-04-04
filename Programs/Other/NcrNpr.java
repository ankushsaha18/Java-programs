package Other;

public class NcrNpr {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 7;
        int r = 3;
        int ncr = factorial(n) / (factorial(r) * factorial(n - r));
        int npr = factorial(n) / factorial(n - r);
        System.out.println("NCR is:" + ncr);
        System.out.println("NPR is:" + npr);
    }

}
