public class perfectnum {
    public static void main(String[] args) {
        int n = 28;
        int div = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                div += i;
            }
        }
        if (n == div) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }
    }

}
