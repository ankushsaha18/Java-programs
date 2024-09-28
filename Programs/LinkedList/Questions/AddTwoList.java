package LinkedList.Questions;

public class AddTwoList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        while (l1 != null && l2 != null){
            temp.next = new ListNode();
            temp.next.val = l1.val+l2.val;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null){
            temp.next = new ListNode();
            temp.next.val = l1.val;
            l1 = l1.next;
        }
        while (l2 != null){
            temp.next = new ListNode();
            temp.next.val = l2.val;
            l2 = l2.next;
        }
        return ans.next;
    }
}
