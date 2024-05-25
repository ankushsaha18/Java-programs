package StackOperations;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        System.out.println(convertToPrefix("(a+b/c*(d+e)-f)"));
    }
    public static String convertToPrefix(String s){
        String ans = "";
        s = reverse(s);
        Stack<Character> op = new Stack<>();
        Stack<Character> operant = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(((int)ch >= 65 && (int)ch <= 90) || ((int)ch >= 97 && (int)ch <=122)){
                operant.push(ch);
            }
            else if(ch == '('){
                while(op.peek() != ')'){
                    operant.push(op.pop());
                }
                op.pop();
            }
            else if(ch == ')'){
                op.push(ch);
            }
            else{
                if(ch == '*' || ch == '/'){
                    op.push(ch);
                }
                else if(ch == '+' || ch == '-'){
                    while (op.peek() == '*' || op.peek() == '/'){
                        operant.push(op.pop());
                    }
                    op.push(ch);
                }
            }
        }
        while(! operant.isEmpty()){
            ans += operant.pop();
        }
        return ans;
    }
    public static String reverse(String s){
        String ans = "";
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            ans += s.charAt(i);
        }
        return ans;
    }
}
