 import java.util.*;
public class diamond {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("How many rows:");
        int n=sc.nextInt();
        int a=n/2;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=a;i>=1;i--){
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
