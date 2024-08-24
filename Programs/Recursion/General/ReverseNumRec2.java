package Recursion.General;

public class ReverseNumRec2 {
    static int ans = 0;
    public static void main(String[] args) {
        System.out.println(reverse(1598));
    }
    static int reverse(int n){
        if(n == 0){
            return ans;
        }
        ans = ans * 10 + (n%10);
        return reverse(n/10);
    }
}
