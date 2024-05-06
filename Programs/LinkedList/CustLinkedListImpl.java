package LinkedList;

public class CustLinkedListImpl {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insertAtFirst(5);
        list.insertAtFirst(4);
        list.insertAtFirst(3);
        list.insertAtLast(20);
        list.insertAtIndex(14,1);
        list.display();
        list.deleteLast();
        list.display();
    }
}
