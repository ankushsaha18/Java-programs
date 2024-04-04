package Discrete;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.printf("%.3f", sqrt(40, 3));
    }

    public static double sqrt(int n, int digits) {
        double ans = 0.0;
        int s = 0, e = n;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (m * m == n) {
                return m;
            } else if (m * m > n) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < digits; i++) {
            while (ans * ans <= n) {
                ans += incr;
            }
            ans -= incr; // above condition false means sqaure is greater than n
            incr /= 10;
        }
        return ans;
    }
}
