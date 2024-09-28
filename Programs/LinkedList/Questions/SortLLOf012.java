package LinkedList.Questions;

public class SortLLOf012 {
    public ListNode sortList(ListNode head) {
        int zero = 0;
        int one = 0;
        int two = 0;
        ListNode temp = head;
        while (temp != null){
            if(temp.val == 0){
                zero++;
            }else if(temp.val == 1){
                one++;
            }
            else {
                two++;
            }
            temp = temp.next;
        }
        temp = head;
        while (temp != null){
            if(zero > 0){
                temp.val = 0;
                zero--;
            }else if(one > 0){
                temp.val = 1;
                one--;
            }else {
                temp.val = 2;
                two--;
            }
            temp = temp.next;
        }
        return head;
    }
}
