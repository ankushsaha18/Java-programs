package Recursion.General;

public class nthfibrec {
    public static int nth(int n) {
        if (n <= 1) {
            return n;
        }

        return nth(n - 1) + nth(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(nth(4));
    }

}
