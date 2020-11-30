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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        ListNode dummy=head,x=null;
        while(dummy.next!=null){
            if(dummy.next.val==dummy.val){
                x=dummy.next;
                dummy.next=x.next;
            }
            else dummy=dummy.next;
        }
        return head;
    }
}