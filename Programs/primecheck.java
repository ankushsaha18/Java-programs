import java.util.Scanner;
public class primecheck {
   
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number to check:");
        int n=in.nextInt();
        System.out.println(check(n));
    
    }
    static boolean check(int n){
            int temp=n/2;
        int j=0;
        for(int i=2;i<=temp;i++){
        if(n%i==0){
         j++;
        }
        }
        if(j==0){
            return true;
        
        }else{
            return false;
        }
    }
    }


