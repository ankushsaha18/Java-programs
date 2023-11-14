import java.util.*;
public class fact {
    public static void fact(int n,int fac){
        if(n== 0){
            System.out.println(fac);
            return;
        }
        fac*=n;
        fact(n-1,fac);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fac=1;
        fact(n,fac);
    }
}
