package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class InbuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(15);
        q.add(20);
        q.add(5);
        q.add(4);
        System.out.println(q.peek());
    }
}
