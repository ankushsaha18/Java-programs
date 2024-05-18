package Queue;

public class CustomQueueImpl {
    public static void main(String[] args) throws Exception{
        CustomQueue q = new CustomQueue();
        q.insert(20);
        q.insert(50);
        q.insert(100);
        q.insert(200);
        System.out.println(q.remove());
        q.display();
    }
}
