package Queue;
import java.util.Stack;

// Time Complexity = O(N)
// Space Complexity = O(2N)


public class QueueUsingStackBruteForce {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void add(int a){
        while (! s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(a);
        while (! s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int remove(){
        return s1.pop();
    }

    public int top(){
        return s1.peek();
    }
}
