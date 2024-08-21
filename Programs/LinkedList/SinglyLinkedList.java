package LinkedList;

public class SinglyLinkedList {
    public Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList(){
        this.size = 0;
    }
    public class Node{
        public int value;
        public Node next;

        public Node(int value){
            this. value = value;
        }
        public Node(int value, Node next){
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

    public void insertUsingRec(int value,int index){
        head = insertRecHelp(value,index,head);
    }

    private Node insertRecHelp(int value,int index,Node n){
        if(index == 0){
            Node temp = new Node(value,n);
            size++;
            return temp;
        }
        n.next =  insertRecHelp(value,index-1,n.next);
        return n;
    }

    public Node get(int index){
        Node temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }
        return temp;
    }

    public double deleteFirst(){
        double val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public double deleteLast(){
        if(size <= 1){
            deleteFirst();
        }
        Node secondLast = get(size - 2);
        double val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public double deleteIndex(int index){
        if(index == 0){
            deleteFirst();
        }
        if (index == size - 1){
            deleteLast();
        }
        Node prev = get(index - 1);
        double val = prev.next.value;
        prev.next = prev.next.next;
        size --;
        return val;
    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        while(current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        tail = head;
        head = prev;
    }

    public void reverseRecursion(){
        tail = head;
        head = reverseRecHelper(head,null);
    }

    public Node reverseRecHelper(Node current,Node prev){
        if(current == null){
            return prev;
        }
        Node nextNode = current.next;
        current.next = prev;
        return reverseRecHelper(nextNode,current);
    }

    public void bubbleSort(){
        if(size < 2){
            return;
        }
        Node current;
        boolean swapped;
        do{
            swapped = false;
            current = head;
            while(current.next != null){
                if(current.value > current.next.value){
                    int temp = current.value;
                    current.value = current.next.value;
                    current.next.value = temp;
                    swapped = true;
                }
                current = current.next;
            }
        }while (swapped);
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
