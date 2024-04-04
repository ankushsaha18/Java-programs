package Other;

import java.util.*;
public class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for which you want factorial:");
        int a=sc.nextInt();
        int fact=1;
        if(a<0){
            System.out.println("Invalid");
        }else{
        for(int i=a;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);}
    }
    
}
