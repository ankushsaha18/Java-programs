import java.util.*;
public class recnum {
    public static void printnum(int n,int lim){
        if(n == lim){
            return;
        }
        System.out.println(n);
        printnum(n+1,lim);
    }
    public static void main(String[] rags){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        System.out.print("Enter limit:");
        int c=sc.nextInt();
        int lim=c+1;
        printnum(n,lim);
    }
}
