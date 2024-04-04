package Other;

import java.util.*;
public class strrev {
    public static void rev(String inp,int n){
        if(n==0){
            System.out.println(inp.charAt(n));
            return;
        }
        System.out.print(inp.charAt(n));
        rev(inp,n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        String inp=sc.next();
        rev(inp,inp.length()-1);

    
    }
    
}
