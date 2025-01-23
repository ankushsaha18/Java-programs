package LinkedList.Types;

public class SinglyLinkedListImpl {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtFirst(10);
        list.insertAtLast(20);
        list.insertAtIndex(15,1);
        list.display();
        list.deleteLast();
        list.display();
        list.display();
        list.reverse();
        list.display();
    }
}
