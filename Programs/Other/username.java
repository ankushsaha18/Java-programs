package Other;

import java.util.*;
public class username {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter email:");
        String em=sc.next();
        String res="";
        for(int i=0;i<=em.length();i++){
            if(em.charAt(i)=='@'){
                break;
            }else{
                res+=em.charAt(i);
            }
        }
        System.out.print(res);
    }
    
}
