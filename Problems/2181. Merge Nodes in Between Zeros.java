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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode ans=new ListNode();
        // here, in ans, the first node will have zero as the val, because the brackets are empty
        // to cover this, in return, ans.next is used
        
        ListNode temp=ans;
        
        while(head.next!=null){
            
            //System.out.println("-------");
            head=head.next;
            
            int tempSum=0;
            
            while(head!=null && head.val!=0){
                
                tempSum+=head.val;
                head=head.next;
            }
            
            //System.out.println(tempSum);
            
            temp.next=new ListNode(tempSum);
            temp=temp.next;
        }
        
        return ans.next;
        
    }
}