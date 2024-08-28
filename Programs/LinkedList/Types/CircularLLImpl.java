package LinkedList.Types;

public class CircularLLImpl {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insert(20);
        list.insert(50);
        list.insert(100);
        System.out.println(list.count());
    }
}
