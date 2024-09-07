package Stack.Basic;
import java.util.Stack;

public class InbuiltStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(20);
        s.push(50);
        s.push(10);
        s.push(100);
        System.out.println(s.peek());
        System.out.println(s.push(25));
    }
}
