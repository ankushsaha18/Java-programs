import java.util.*;
class test{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a=0;
       int b=1;
       int count=2;
       while(count<=n){
        int c=a+b;
        a=b;
        b=c;
        count++;
       }
       System.out.println(b);

    }
}