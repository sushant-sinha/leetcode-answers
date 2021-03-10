// SUSHANT SINHA

// 0ms 36.6mb ( 21.48% )

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
    public ListNode middleNode(ListNode head) {
        
        int i=0,x=1;
        ListNode ans=head;
        while(ans!=null){
            i++;
            ans=ans.next;
        }
        
        
        if(i/2==0)i/=2;
        else {
            i/=2;++i;
        }
                
        while(x<i){
            head=head.next;
            x++;
        }
        
        return head;
        
    }
}