package Recursion;

public class countZeors {
    public static void main(String[] args) {
        System.out.println(count(1020301));
    }
    static int count(int n){
        if(n == 0){
            return 0;
        }
        if(n%10 == 0){
            return 1 + count(n/10);
        }
        return count(n/10);
    }
}
