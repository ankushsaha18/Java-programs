package Recursion.General;

public class ReverseNumRec {
    public static void main(String[] args) {
        System.out.println(reverse(4526));
    }
    static int reverse(int n) {
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }
    static int helper(int n,int digits){
        if(digits == 0){
            return 0;
        }
        return n%10 * (int) Math.pow(10,digits - 1) + helper(n/10,digits - 1);
    }
}
