package Bit;

public class setBitCalc {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(calcSetBit(n));
    }

    public static int calcSetBit(int n) {
        int cnt = 0;
        while (n > 0) {
            n = n & (n - 1);
            cnt++;
        }
        return cnt;
    }
}
