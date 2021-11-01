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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        int start=100001,end=0;
        
        int prev_val=head.val, min_d=100001;
        
        for (int i=0;head.next!=null;i++){
            
            if ((prev_val<head.val && head.val>head.next.val) || (prev_val>head.val && head.val<head.next.val)) {
                
                if (end != 0)
                    min_d= min_d<(i-end) ? min_d : (i - end);
                
                start= start<i ? start : i;
                end=i;
                
            }
            
            prev_val=head.val;
            head=head.next;
        }
        
        if (min_d == 100001)
            return new int[] {-1,-1};
        
        return new int[] {min_d,end-start};
        
    }
}