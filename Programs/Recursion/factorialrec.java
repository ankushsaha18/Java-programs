package Recursion;

public class factorialRec {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    static int factorial(int n){
        if(n < 2){
            return 1;
        }
        return n * factorial(n-1);
    }
}
