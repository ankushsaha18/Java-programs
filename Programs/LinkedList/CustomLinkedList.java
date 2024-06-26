package LinkedList;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this. value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
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
        for(int i = 0 ; i<index - 1 ; i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
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
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size --;
        return val;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
