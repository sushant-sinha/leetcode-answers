// SUSHANT SINHA

// 1ms ( 69.53% ) 43mb ( 18.23% )

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
        
        /*
        
        if i will be doing (less.next=more_head;) right now and then returning the less_head...
        
        the solution for the first test case will be : [0,1,2,2,0,4,3,5]
        
        so i will have to remove the: '0' before the individual lists
        
        less_head=less_head.next;
        more_head=more_head.next;
        
        *** cannot use this idea... because if the less_head is empty... then we will get the wrong answer....
        
        *** but if the more_head is empty... we wont get wrong answer... because more_head.next is pointing towards null.. see line 38
        
        therefor the pointing from the less list towards the more list should be careful.
        
        */
        
        less.next=more_head.next;
        
        return less_head.next;
    }
}