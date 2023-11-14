import java.util.*;
public class advpattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");
        int a=sc.nextInt();
        for(int i=1;i<=a/2;i++){
            for(int j=1;j<=i;j++){
                    System.out.print("*");
            }
            int space=2*((a/2)-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=a/2;i>=1;i--){
            for(int j=1;j<=i;j++){
                    System.out.print("*");
            }
            int space=2*((a/2)-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
