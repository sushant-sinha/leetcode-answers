//SUSHANT SINHA 
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return null;
        ListNode slow = head,fast=head;
        boolean hasCycle = false;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next; 
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        if (!hasCycle) return null;
        fast = head;
        while (true) {
            if (fast == slow) return slow;
            slow = slow.next;
            fast = fast.next;
        }
        
    }
}