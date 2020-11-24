// SUSHANT SINHA
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode cur1 = l1, cur2 = l2;
        while (cur1 != null || cur2 != null) {
            if (cur1 == null || (cur2 != null && cur1.val > cur2.val)) {
                prev.next = cur2;
                cur2 = cur2.next;
            } else {
                prev.next = cur1;
                cur1 = cur1.next;
            }
            prev = prev.next;
        }
        return dummy.next;
    }
}