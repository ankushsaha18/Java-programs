import java.util.*;
public class towofhanoi {
    public static void hanoi(int n,String src,String help,String dest){
        if(n==1){
            System.out.println("Transferred "+n+" from "+src+" to "+dest);
            return;
        }
        hanoi(n-1,src,dest,help);
        System.out.println("Tranferred "+n+" from "+src+" to "+dest);
        hanoi(n-1,help,src,dest);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of disks:");
        int n=sc.nextInt();
        hanoi(n,"Source","Helper","Destination");
    }
}
