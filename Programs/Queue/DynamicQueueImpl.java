package Queue;

public class DynamicQueueImpl {
    public static void main(String[] args) throws Exception{
        DynamicQueue dq = new DynamicQueue(3);
        dq.insert(5);
        dq.insert(7);
        dq.insert(18);
        dq.insert(3);
        dq.insert(45);
        dq.display();
        System.out.println(dq.remove());
        dq.display();
        dq.insert(133);
        dq.display();
    }
}
