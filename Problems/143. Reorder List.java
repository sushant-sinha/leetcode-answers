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

// to do... below solution was presented by https://leetcode.com/ashu25/

// https://leetcode.com/problems/reorder-list/discuss/1640806/Javaor2-Approach-or-2-Pointer-approach
// https://leetcode.com/problems/reorder-list/discuss/1640597/C%2B%2BJavaPython-2-Solutions-oror-Visualized-Explanation-oror-Beginner-Friendly


class Solution {
    public ListNode midNode(ListNode head){
        ListNode fast =  head, slow  =  head;
        while(fast.next!=null && fast.next.next!=null){
            fast =  fast.next.next;
            slow =  slow.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        ListNode curr =  head, prev=  null, next = null;
        while(curr!=null){
            next  =  curr.next;
            curr.next =  prev ;
            prev =  curr;
            curr  =  next;
        }
        return prev;
    }

    
    public void reorderList(ListNode head) {
        
        ListNode midNode =  midNode(head);
        ListNode nextToMid =  midNode.next;
        midNode.next = null;
        ListNode rev =  reverse(nextToMid);
        
        ListNode p1 =  head , p2 =  rev,p1Next;    
        while(p1!=null && p2!=null){
            p1Next =  p1.next;                                    
			p1.next =  p2;
			           
            p1 =  p2;
            p2=p1Next;                        
        }                
    }            
}