import java.util.*;
public class power2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        int a=num-1;
        if((num & a)==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        
    }
    
}
