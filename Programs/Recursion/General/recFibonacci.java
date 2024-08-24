package Recursion.General;

public class recFibonacci {
    public static void main(String[] args) {
        int term = 3;
        System.out.println(fibonacci(term));
    }

    public static int fibonacci(int n) { // 0 indexed
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
