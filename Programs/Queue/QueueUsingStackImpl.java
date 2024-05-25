package Queue;

public class QueueUsingStackImpl {
    public static void main(String[] args) {
        QueueUsingStackOptimised qs = new QueueUsingStackOptimised();
        qs.add(5);
        qs.add(8);
        qs.add(90);
        System.out.println(qs.top());
        System.out.println(qs.remove());
        System.out.println(qs.top());
    }
}
