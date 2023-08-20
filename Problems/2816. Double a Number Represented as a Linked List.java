// SUSHANT SINHA

// 19ms ( 18.26% ) 44.7mb ( 69.79% )

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
    public ListNode doubleIt(ListNode head) {
        
        // when the first value is 0... this means it is 0
        if(head.val==0)
            return head;
        
         // not reusing the same linkedlist
        
        Stack<Integer> num=new Stack<>();
        
        while(head!=null){
            num.push(head.val);
            head=head.next;
        }
        
        int val=num.pop();
        
        ListNode ans=new ListNode();
        
        ListNode prev=new ListNode((val*2)%10);
        
        int carry= val*2 > 9 ? 1 : 0;
        
        if(carry==0 && num.size()==0){
            ans.val=val*2;
            return ans;
        }
        
        while(num.size()!=0){
            
            val=num.pop();
            
            ListNode temp=new ListNode((val*2+carry)%10);
            
            carry= val*2+carry > 9 ? 1 : 0;
            
            temp.next=prev;
            prev=temp;
            ans.next=prev;
            
        }
        
        
        
        if(carry!=0){
            ListNode temp=new ListNode(1);
            temp.next=prev;
            ans.next=temp;
        }
        
        return ans.next;
        
    }
}