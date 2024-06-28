package Queue;

public class QueueUsingLLImpl {
    public static void main(String[] args) {
        QueueUsingLL qll = new QueueUsingLL();
        qll.insert(50);
        qll.insert(7);
        qll.insert(20);
        qll.display();
        qll.delete();
        qll.display();
    }
}
