package Pattern;

import java.util.*;
public class binpyr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2!=0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }System.out.println();
        }
    } 
}
