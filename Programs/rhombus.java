import java.util.*;
public class rhombus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            int space=a-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
