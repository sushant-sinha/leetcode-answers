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
    public ListNode partition(ListNode head, int x) {
        
        
        ListNode less_head=new ListNode();
        ListNode less=less_head;
        
        ListNode more_head=new ListNode();
        ListNode more=more_head;
        
        while(head!=null){
            
            if(head.val<x){
                less.next=head;
                less=less.next;
            }
            
            else{
                more.next=head;
                more=more.next;
            }
            
            head=head.next;
            
        }
        
        // ending the linkedlist
        more.next=null;
        
        less.next=more_head.next;
        
        return less_head.next;
    }
}