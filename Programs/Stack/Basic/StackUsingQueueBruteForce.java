package Stack.Basic;
import java.util.LinkedList;
import java.util.Queue;

// Time Complexity = O(N)
// Space Complexity = O(2N)


public class StackUsingQueueBruteForce {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int a) {
        q2.add(a);
        while(! q1.isEmpty()){
            q2.add(q1.remove());
        }
        while (! q2.isEmpty()){
            q1.add(q2.remove());
        }
    }

    public int pop(){
        return q1.remove();
    }

    public int top(){
        return q1.peek();
    }
}
