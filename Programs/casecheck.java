import java.util.*;
public class casecheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a>='a' && a<='z'){
            System.out.println("Lowercase");
        }else if(a>='A' && a<='Z'){
            System.out.println("Uppercase");
        }else{
            System.out.println("Bhag chutiye");
        }

    }
    
}
