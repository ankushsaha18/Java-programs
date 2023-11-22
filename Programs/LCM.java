import java.util.Scanner;
public class LCM {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int n=sc.nextInt();
        System.out.print("Enter second number:");
        int m=sc.nextInt();
        System.out.println(lcm(n,m));
    }
    static int lcm(int a,int b){
        int ans = (a > b) ? a : b;
        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }
        return ans;

    }
    
}
