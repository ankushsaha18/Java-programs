package Stack;

class Node{
    int info;
    Node next;
}

public class StackUsingLL {
    private static Node top = null;

    public void push(int x) {
        Node p = new Node();
        p.info = x;
        if (top == null) {
            top = p;
        } else {
            p.next = top;
            top = p;
        }
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.info;
        top = top.next;
        return popped;
    }

    public int peek(){
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return top.info;
    }

    public void display() {
        Node temp = top;
        System.out.println("Stack is ---");
        while (temp != null) {
            System.out.print(temp.info + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
