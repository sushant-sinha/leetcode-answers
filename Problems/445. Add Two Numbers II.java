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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> list1=new Stack<>();
        Stack<Integer> list2=new Stack<>();

        while(l1!=null){
            list1.push(l1.val);
            l1=l1.next;
        }
        
        while(l2!=null){
            list2.push(l2.val);
            l2=l2.next;
        }

        int carry=0;

        int onesPlace=(list1.pop())+(list2.pop());

        if(onesPlace>9){
            onesPlace-=10;
            carry=1;
        }

        ListNode ones=new ListNode(onesPlace);
        ones.next=null;

        ListNode head=new ListNode();
        head.next=ones;

        while(!list1.empty() || !list2.empty()){

            int x=carry;

            if(!list1.empty())
                x+=list1.pop();
            
            if(!list2.empty())
                x+=list2.pop();

            if(x>9){
                x-=10;
                carry=1;
            }

            else{
                carry=0;
            }

            // System.out.println(x+" boolean="+(!list1.empty() || !list2.empty()));
            
            ListNode temp=new ListNode(x);
            temp.next=head.next;
            head.next=temp;
        }

        if(carry==1){
            ListNode temp=new ListNode(1);
            temp.next=head.next;
            head.next=temp;
        }

        // while(head!=null){
        //     System.out.println(head.val);
        //     head=head.next;
        // }

        return head.next;

    }
}