import java.util.*;
public class sumofodd {
    public static void oddsum(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                c=c+i;
            }
        }
        System.out.println(c);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        oddsum(n);
    }
}