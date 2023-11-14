import java.util.*;
public class numberpyr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                if(j<i){
                System.out.print(j);}
                else{
                    System.out.print(" ");
                }
                }
                 System.out.println();
            }
        }
    }
    

