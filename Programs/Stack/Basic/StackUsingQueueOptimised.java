package Stack.Basic;
import java.util.LinkedList;
import java.util.Queue;

// Time Complexity = O(N)
// Space Complexity = O(N)

public class StackUsingQueueOptimised {
    Queue<Integer> q = new LinkedList<>();

    public void push(int a) {
        q.add(a);
        for(int i = 0 ; i < q.size() - 1 ;i++){
            q.add(q.remove());
        }
    }

    public int pop(){
        return q.remove();
    }

    public int top(){
        return q.peek();
    }
}
