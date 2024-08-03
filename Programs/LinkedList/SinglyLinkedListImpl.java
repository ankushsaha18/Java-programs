package LinkedList;

public class SinglyLinkedListImpl {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        list.insertAtFirst(5);
        list.insertAtLast(2);
        list.insertAtFirst(26);
        list.insertAtLast(1000);
        list.display();
        list.insertUsingRec(22,2);
        list.display();
    }
}
