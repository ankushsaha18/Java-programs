import java.util.*;
public class palindromeString {
    static boolean pal(String a){
        boolean ans;
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }
        if(a.equals(b)){
          ans=true;  
        }
        else{
            ans=false;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        System.out.println(pal(a));
    }
    

}

