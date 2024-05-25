package StackOperations;
import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        System.out.println(convert("-9/*+5346"));
    }
    public static String convert(String prefix){
        String ans = "";
        Stack<String> s = new Stack<>();
        for(int i = prefix.length() - 1 ; i >=0 ; i--){
            char ch = prefix.charAt(i);
            if((int) ch >= 48 && (int) ch <= 57){
                s.push(ch + "");
            }
            else {
                String val1 = s.pop();
                String val2 = s.pop();
                String temp = val1 + val2 + ch;
                s.push(temp);
            }
        }
        while (!s.isEmpty()){
            ans += s.pop();
        }
        return ans;
    }
}
