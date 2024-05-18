package LinkedList;

public class CircularLL {

    private Node Head;
    private Node Tail;

    public CircularLL(){
        this.Head = null;
        this.Tail = null;
    }

    private class Node{
        private Node next;
        private int value;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insert(int value){
        Node node = new Node(value);
        if(Head == null){
            Head = node;
            Tail = node;
            return;
        }
        Tail.next = node;
        node.next = Head;
        Tail = node;
    }

    public void display(){
        Node temp = Head;
        if(temp == null){
            System.out.println("Null");
            return;
        }
        do{
            System.out.print(temp.value + "->");
            temp = temp.next;
        }while (temp != Head);
        System.out.println("HEAD");
    }

    public void delete(int value) {
        Node temp = Head;
        if(temp == null){
            return;
        }
        do{
            if(temp.next.value == value){
                if(temp.next == Head){
                    Head = temp.next.next;
                }
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }while (temp != Head);
    }
}
