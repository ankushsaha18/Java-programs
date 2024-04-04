package Bit;

import java.util.*;
public class bitfind {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int a=sc.nextInt();
        System.out.print("Enter positions:");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        if((bitmask & a)==0){
            System.out.print("Bit is zero");
        }else{
            System.out.print("Bit is one");
        }
    }
    
}
