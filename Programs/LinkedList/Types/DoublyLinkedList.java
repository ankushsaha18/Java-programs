package LinkedList.Types;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node prev,Node next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertAtLast(int value){
        if(tail == null){
            insertAtFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    public void insertAtIndex(int value,int index){
        if(index == 0){
            insertAtFirst(value);
            return;
        }
        if(index == size){
            insertAtLast(value);
            return;
        }
        Node temp = head;
        for(int i = 0 ; i < index - 1 ; i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp,temp.next);
        temp.next.prev = node;
        temp.next = node;
        size++;
    }

    public void insertAfterVal(int after,int value){
        Node node = new Node(value);
        Node temp = head;
        while(temp != null){
            if(temp.value == after){
                node.next = temp.next;
                temp.next.prev = node;
                node.prev = temp;
                temp.next = node;
                size++;
                break;
            }
            temp = temp.next;
        }
    }

    public Node get(int index){
        Node temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }
        return temp;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        head.prev = null;
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteIndex(int index){
        if(index == 0){
            deleteFirst();
        }
        if (index == size - 1){
            deleteLast();
        }
        Node previous = get(index - 1);
        int val = previous.next.value;
        previous.next = previous.next.next;
        previous.next.prev = previous;
        size --;
        return val;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    public void reverseDLL() {
        Node current = head;
        Node previous = null;
        while (current != null){
            Node nextNode = current.next;
            current.next = previous;
            current.prev = nextNode;
            previous = current;
            current = nextNode;
        }
        head = previous;
    }
}
