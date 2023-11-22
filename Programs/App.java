import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a="0";
        int sum=0;
        while(true){
             if(a=="x"){
                break;
            }

            System.out.print("Enter number:");
            int temp=Integer.valueOf(in.nextLine());
            sum+=temp;
            a=String.valueOf(temp);
       
    }
        System.out.println(sum);
    }
}
    

