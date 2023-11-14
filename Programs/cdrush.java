import java.util.*;
public class cdrush{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        if(a>=1 || c<=100){
            if(a==b){
                if(b==c){
                    System.out.println("Equilateral");
                }else{
                    System.out.println("Isosceles");
                }
            }else if(b==c){
                System.out.println("Isosceles");
            }else if(c==a){
                System.out.println("Isosceles");
            }else{
                System.out.print("Scalene");
            }
        }else{
            System.out.println("Invalid");
        }
    }
}