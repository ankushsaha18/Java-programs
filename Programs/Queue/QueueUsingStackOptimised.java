package Queue;
import java.util.Stack;

// Time Complexity = O(1)
// Space Complexity = O(N)


public class QueueUsingStackOptimised {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void add(int a){
        input.push(a);
    }

    public int remove(){
        if(output.isEmpty()){
            while (! input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    public int top(){
        if(output.isEmpty()){
            while (! input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    public int size() {
        return (output.size() + input.size());
    }
}
