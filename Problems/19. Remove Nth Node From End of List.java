// SUSHANT SINHA

// old Novemeber 2020 submission
// 0ms - 1ms ( ~100% ) 36.8mb - 42.5mb ( 99.98% )

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fp = head;
        for (int i = 0; i < n; ++i) {
            fp = fp.next;
        }
        if (fp == null) return head.next;
        ListNode sp = head;
        while (fp.next != null) {
            fp = fp.next;
            sp = sp.next;
        }
        sp.next = sp.next.next;
        return head;
    }
}