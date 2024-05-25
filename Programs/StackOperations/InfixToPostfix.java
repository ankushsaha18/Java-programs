package StackOperations;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        System.out.println(convertToPostfix(("(9+3-(2+5)*7)")));
    }
    public static String convertToPostfix(String s){
        String ans = "";
        Stack<Character> op = new Stack<>();
        Stack<Character> operant = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(((int)ch >= 65 && (int)ch <= 90) || ((int)ch >= 97 && (int)ch <=122) || ((int) ch >= 48 && (int) ch <= 57)){
                operant.push(ch);
            }
            else if(ch == ')'){
                while(op.peek() != '('){
                    operant.push(op.pop());
                }
                op.pop();
            }
            else if(ch == '('){
                op.push(ch);
            }
            else{
                if(ch == '*' || ch == '/'){
                    while (op.peek() == '*' || op.peek() == '/'){
                        operant.push(op.pop());
                    }
                    op.push(ch);
                }
                else if(ch == '+' || ch == '-'){
                    while (op.peek() == '*' || op.peek() == '/' || op.peek() == '+' || op.peek() == '-'){
                        operant.push(op.pop());
                    }
                    op.push(ch);
                }
            }
        }
        while(! operant.isEmpty()){
            ans += operant.pop();
        }
        return reverse(ans);
    }
    public static String reverse(String s){
        String ans = "";
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            ans += s.charAt(i);
        }
        return ans;
    }
}
