package Recursion.General;

public class prodOfDigitsRec {
    public static void main(String[] args) {
        System.out.println(prodOfDigits(1251));
    }
    static int prodOfDigits(int n){
        if(n%10 == n){  // means single digit
            return n;
        }
        return n%10 * prodOfDigits(n/10);
    }
}
