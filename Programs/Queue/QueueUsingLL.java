package Queue;

class Node{
    int info;
    Node next;
}

public class QueueUsingLL {
    private static Node front = null;
    private static Node rear = null;

    public void insert(int x) {
        Node p = new Node();
        p.info = x;
        if (rear == null) {
            front = rear = p;
        } else {
            rear.next = p;
            rear = p;
        }
    }

    public int delete() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int deleted = front.info;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return deleted;
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.println("Queue is ---");
        while (temp != null) {
            System.out.print(temp.info + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public int peek(){
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.info;
    }
}
