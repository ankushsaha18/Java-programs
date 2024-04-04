package Other;

import java.util.*;
public class eleventable{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number whose table you want:");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+"x"+i+"="+i*a);
        }

    }
}