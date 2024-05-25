package StackOperations;

import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        System.out.println(evaluate("-9/*+5346"));
    }
    public static int evaluate(String s){
        Stack<Integer> num = new Stack<>();
        for(int i = s.length() - 1 ; i >=0 ; i--){
            char ch = s.charAt(i);
            if((int) ch >= 48 && (int) ch <= 57){
                num.push((int)ch - 48);
            }
            else if(ch == '+' || ch == '*' || ch == '/' || ch == '-'){
                int val2 = num.pop();
                int val1 = num.pop();
                if(ch == '-') {num.push(val2 - val1);}
                if(ch == '+') {num.push(val1 + val2);}
                if(ch == '*') {num.push(val1 * val2);}
                if(ch == '/') {num.push(val2 / val1);}
            }
        }
        return num.pop();
    }
}
