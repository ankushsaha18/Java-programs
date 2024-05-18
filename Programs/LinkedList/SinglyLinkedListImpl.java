package LinkedList;

public class SinglyLinkedListImpl {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        list.insertAtFirst(5);
        list.insertAtLast(2);
        list.display();
        list.bubbleSort();
        list.display();
        list.insertAtFirst(26);
        list.deleteLast();
        list.display();
        list.reverse();
        list.insertAtLast(1000);
        list.display();
    }
}
