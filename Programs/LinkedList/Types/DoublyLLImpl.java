package LinkedList.Types;

public class DoublyLLImpl {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtFirst(5);
        list.insertAtFirst(3);
        list.insertAtFirst(15);
        list.insertAtLast(26);
        list.insertAtIndex(55,1);
        list.display();
        list.deleteLast();
        list.display();
        list.insertAfterVal(15,420);
        list.display();
        list.reverseDLL();
        list.display();
    }
}
