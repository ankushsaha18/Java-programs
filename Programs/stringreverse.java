import java.io.*;
import java.util.*;
public class stringreverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(a);
        sb.reverse();
        System.out.println(sb);
    }
    
}
