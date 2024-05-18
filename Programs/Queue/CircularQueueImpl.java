package Queue;

public class CircularQueueImpl {
    public static void main(String[] args) throws Exception{
        CircularQueue cq = new CircularQueue(4);
        cq.insert(5);
        cq.insert(10);
        cq.insert(100);
        cq.insert(70);
        cq.display();
        System.out.println(cq.remove());
        cq.insert(133);
        cq.display();
    }
}
