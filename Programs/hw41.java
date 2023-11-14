import java.util.*;
public class hw41 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter input:");
        int a;
        do{
            System.out.print("Enter marks:");
            int marks=sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("Very good");
            }else if(marks>=60 && marks<90){
                System.out.println("Good");
            }else if(marks>=0 && marks<60){
                System.out.println("Try better");
            }else{
                System.out.println("Invalid");
            }
            System.out.print("wanna continue?:");
            a=sc.nextInt();
        }while(a==1);
    }
    
}
