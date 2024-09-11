package Stack.StackOperations;
import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        String problem = "(9+(3+4))*2";
        System.out.println(evaluateInfix(problem));
    }
    public static int evaluateInfix(String problem){
        Stack<Integer> num = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0 ; i < problem.length() ; i++){
            char ch = problem.charAt(i);
            int ascii = (int) ch;
            if((ascii >= 48 && ascii <= 57)){
                num.push(ascii - 48);
            }
            else if(op.isEmpty() || op.peek() == '(' || ch == '('){
                op.push(ch);
            }
            else if(ch == ')'){
                while (op.peek() != '('){
                    int val1 = num.pop();
                    int val2 = num.pop();
                    if(op.peek() == '-') {num.push(val2 - val1);}
                    if(op.peek() == '+') {num.push(val1 + val2);}
                    if(op.peek() == '*') {num.push(val1 * val2);}
                    if(op.peek() == '/') {num.push(val2 / val1);}
                    op.pop();
                }
                op.pop();
            }
            else{
                if(ch == '+' || ch == '-'){
                    int val1 = num.pop();
                    int val2 = num.pop();
                    if(op.peek() == '-') {num.push(val2 - val1);}
                    if(op.peek() == '+') {num.push(val1 + val2);}
                    if(op.peek() == '*') {num.push(val1 * val2);}
                    if(op.peek() == '/') {num.push(val2 / val1);}
                    op.pop();
                    op.push(ch);
                }
                else if(ch == '*' || ch == '/'){
                    while (op.peek() == '*' || op.peek() == '/'){
                        int val1 = num.pop();
                        int val2 = num.pop();
                        if(op.peek() == '*') {num.push(val1 * val2);}
                        if(op.peek() == '/') {num.push(val2 / val1);}
                        op.pop();
                    }
                    op.push(ch);
                }
            }
        }
        while (num.size() > 1){
            int val1 = num.pop();
            int val2 = num.pop();
            if(op.peek() == '-') {num.push(val2 - val1);}
            if(op.peek() == '+') {num.push(val1 + val2);}
            if(op.peek() == '*') {num.push(val1 * val2);}
            if(op.peek() == '/') {num.push(val2 / val1);}
            op.pop();
        }
        return num.pop();
    }
}
