public class factors {
    static int min = 1;

    public static void factor(int n) {
        if (min != n) {
            if (n % min == 0) {
                System.out.print(min + " ");
            }
            min++;
            factor(n);
        }
    }

    public static void main(String[] args) {
        factor(28);
    }

}
