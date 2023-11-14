import java.util.*;
public class fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+" ");
        for(int i=1;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
