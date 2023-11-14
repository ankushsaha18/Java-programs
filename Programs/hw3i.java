import java.util.*;
public class hw3i {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        System.out.print("Enter Operation:");
        String inp=sc.next();
        switch(inp){
            case "+" : System.out.println(a+b);
            break;
            case "-" : System.out.println(a-b);
            break;
            case "*" : System.out.println(a*b);
            break;
            case "/" : System.out.println(a/b);
            break;
            case "%" : System.out.println(a%b);
            break;
        }
    }
    
}
