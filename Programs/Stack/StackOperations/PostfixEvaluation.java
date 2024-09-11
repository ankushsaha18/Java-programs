package Stack.StackOperations;
import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        System.out.println(evaluate("6324+-*"));
    }
    public static int evaluate(String s){
        Stack<Integer> num = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if((int) ch >= 48 && (int) ch <= 57){
                num.push((int)ch - 48);
            }
            else if(ch == '+' || ch == '*' || ch == '/' || ch == '-'){
                int val1 = num.pop();
                int val2 = num.pop();
                if(ch == '-') {num.push(val2 - val1);}
                if(ch == '+') {num.push(val1 + val2);}
                if(ch == '*') {num.push(val1 * val2);}
                if(ch == '/') {num.push(val2 / val1);}
            }
        }
        return num.pop();
    }
}
