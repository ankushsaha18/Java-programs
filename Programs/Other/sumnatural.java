package Other;

import java.util.*;
public class sumnatural {
    public static void printsum(int a,int b,int sum){
        if(a==b+1){
            System.out.println(sum);
            return;
        }
        sum+=a;
        printsum(a+1,b,sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting num:");
        int a=sc.nextInt();
        System.out.print("Enter last number:");
        int b=sc.nextInt();
        int sum=0;
        printsum(a,b,sum);
    }
}
