// SUSHANT SINHA

// 0ms solution from the submission tab

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;
        
        while(n > 0) {
            right = right.next;
            n -= 1;
        }
        
        while(right != null) {
            left = left.next;
            right = right.next;
        }
        
        left.next = left.next.next;
        return dummy.next;
    }
}

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