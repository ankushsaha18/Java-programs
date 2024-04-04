package Discrete;

public class LCM_usingGCD {
    public static void main(String[] args) {
        System.out.println(LCM(9, 4));
    }

    public static int LCM(int a, int b) {
        int d = GCD(a, b);
        return a * b / d;
    }

    public static int GCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return GCD(b % a, a);
    }
}
