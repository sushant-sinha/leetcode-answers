// SUSHANT SINHA
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode cur = head;
        ListNode evenHead =head.next;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            if (next == null) break;
            cur.next = next.next;
            if (cur.next == null) break;
            next.next = cur.next.next;
            
            cur = cur.next; // update cur
        }
        cur.next = evenHead;
        return head;
    }
}