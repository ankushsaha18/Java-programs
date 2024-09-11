package Stack.StackOperations;

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        System.out.println(convert(""));
    }
    public static String convert(String postfix){
        String ans = "";
        Stack<String> s = new Stack<>();
        for(int i = 0; i < postfix.length() ; i++){
            char ch = postfix.charAt(i);
            if(((int)ch >= 65 && (int)ch <= 90) || ((int)ch >= 97 && (int)ch <=122) || ((int) ch >= 48 && (int) ch <= 57)){
                s.push(ch + "");
            }
            else {
                String val2 = s.pop();
                String val1 = s.pop();
                String temp = ch + val1 + val2;
                s.push(temp);
            }
        }
        while (!s.isEmpty()){
            ans += s.pop();
        }
        return ans;
    }
}
