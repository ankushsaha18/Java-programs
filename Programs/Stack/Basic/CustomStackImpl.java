package Stack.Basic;

public class CustomStackImpl {
    public static void main (String[] args) throws Exception {
        CustomStack stack = new CustomStack(2);
        stack.push(20);
        stack.push(50);
        stack.push(10);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
