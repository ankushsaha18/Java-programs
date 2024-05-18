package DeQue;
import java.util.ArrayDeque;
import java.util.Deque;

public class InbuiltDequeue {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(20);
        dq.addLast(50);
        dq.addFirst(100);
        dq.add(69);
        System.out.println(dq.peek());
        dq.removeFirst();
        System.out.println(dq.peekLast());
    }
}
