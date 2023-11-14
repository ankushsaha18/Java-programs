import java.util.*;
public class powerrec {
    public static int powcal(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int p=powcal(x,n-1);
        int c=x*p;
        return c;
    }  
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int x=sc.nextInt();
        System.out.print("Enter power:");
        int n=sc.nextInt();
        System.out.println(powcal(x,n));
    }  
}
