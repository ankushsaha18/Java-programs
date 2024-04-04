package Discrete;

public class fastModulus {
    public static void main(String[] args) {
        System.out.println(powerCalc(0, 2));
    }

    static int powerCalc(int n, int p) {
        int ans = 1;
        while (p > 0) {
            if ((p & 1) != 0) {
                ans *= n;
            }
            n *= n;
            p >>= 1;
        }
        return ans;
    }
}
