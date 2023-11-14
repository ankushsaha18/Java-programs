import java.util.*;
public class GCD {
    public static int gcd(int a,int b){
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter Second number:");
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
    }
    
}
