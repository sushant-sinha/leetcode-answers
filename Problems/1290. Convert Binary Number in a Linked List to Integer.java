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
    public int getDecimalValue(ListNode head) {
        
        int num[] = new int[30];
        int i=0;
        
        while(head!=null){
            
            num[i++]=head.val;
            head=head.next;
            
        }
        
        int ans=0;
        
        for(int j=0;j<i;j++){
            
            if(num[j]==1)
                ans+=Math.pow(2,(i-j-1));
            
        }
        
        return ans;
        
    }
}