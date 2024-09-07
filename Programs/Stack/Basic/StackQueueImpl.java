package Stack.Basic;


public class StackQueueImpl {
    public static void main(String[] args) {
        StackUsingQueueOptimised s = new StackUsingQueueOptimised();
        s.push(5);
        s.push(7);
        s.push(8);
        s.push(10);
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.top());
    }
}
