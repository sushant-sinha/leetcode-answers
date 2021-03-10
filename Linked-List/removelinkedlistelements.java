// SUSHANT SINHA
public class Solution {
	
    public ListNode removeElements(ListNode head, int val) {
        
        /*if(head == null) return null;
        
        while(head!=null){
            if(head.val == val){
                head = head.next;
            }else{
                break;
            }
        }
        
        ListNode p = head;
        
        if(p == null) return null;
        
        while(p.next != null){
            if(p.next.val == val){
                ListNode q = p.next;
                p.next = q.next;
            }else{
                p = p.next;
            }
        }
        return head;*/
        ListNode temp=head,x=null;
        while(temp.next!=null){
        if(temp.next.val==val){x=temp.next;temp.next=x.next;}
           else temp=temp.next;
        }
        return head;
        
    }
}