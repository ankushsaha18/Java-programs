package Other;

import java.util.*;
public class average {
    public static float aveg(float a,float b,float c){
        float y=(a+b+c)/3;
        return y;
        

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        float a=sc.nextFloat();
        System.out.print("Enter second number:");
        float b=sc.nextFloat();
        System.out.print("Enter third number:");
        float c=sc.nextFloat();
        float d=aveg(a,b,c);
        System.out.println(d);
        
    }
}
