package Other;

import java.util.*;
public class functionmultiply {
    public static int multiply(int a,int b){
    return a*b;
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first number:");
    int a=sc.nextInt();
    System.out.print("Enter second number:");
    int b=sc.nextInt();
    int mul=multiply(a,b);
    System.out.println("Product is:"+mul);
}
}
