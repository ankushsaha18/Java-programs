package Bit;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 1;
        int count = 1;
        int ans = 0;
        while (n > 0) {
            ans += Math.pow(5, count) * (n & 1);
            count++;
            n >>= 1;
        }
        System.out.println(ans);
    }
}
