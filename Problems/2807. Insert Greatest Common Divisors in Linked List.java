// SUSHANT SINHA

// 22ms ( 20.79% ) 44.5mb ( 10.74% )

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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode cur=head;
        ListNode prev=null;
        
        while(cur.next!=null){
            prev=cur;
            cur=cur.next;
            int gcd=gcd(cur.val, prev.val);
            
            ListNode newNode=new ListNode(gcd);
            
            prev.next=newNode;
            newNode.next=cur;
        }
        
        return head;
        
    }
    
    int gcd(int i, int j){
        
        int cur=Math.min(i,j);
        
        for(;cur>=1;cur--){
            
            if(i%cur==0 && j%cur==0){
                return cur;
            }
        }
        
        return 1;
    }
    
}