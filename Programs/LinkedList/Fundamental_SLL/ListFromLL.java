package LinkedList.Fundamental_SLL;
import java.util.ArrayList;
import java.util.List;

public class ListFromLL {
    public List<Integer> LLTraversal(ListNode head) {
        List<Integer> ans = new ArrayList<>();
        ListNode temp = head;
        while (temp != null){
            ans.add(temp.val);
            temp = temp.next;
        }
        return ans;
    }
}
