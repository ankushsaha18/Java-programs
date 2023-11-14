import java.util.*;
public class numrev{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int a=sc.nextInt();
        int b=0;
        while(a>0){
            b*=10;
            b+=a%10;
            a/=10;
        }
        System.out.println(b);
    }
}