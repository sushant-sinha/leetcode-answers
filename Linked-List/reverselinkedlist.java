// SUSHANT SINHA
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
    public ListNode reverseList(ListNode head) {
        ListNode temp=null,newHead = null;
        ListNode cur = head;
        while (cur != null) {
            temp = cur;
            cur = cur.next;
            
            temp.next = newHead;
            System.out.println("newhead "+temp.next.val);
            newHead = temp;
            // System.out.println("newhead "+newHead.val);
        }
        return newHead;
    }
}