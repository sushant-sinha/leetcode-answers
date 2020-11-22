//SUSHANT SINHA 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        else if(headA.next==null && headB.next==null && headA.val==headB.val) return headA;
        int alen=getLength(headA);
        boolean f=false;
        int blen=getLength(headB);
        ListNode a=headA,b=headB;
        if(alen>=blen){
        for(int i=0;i<alen;i++){
            b=headB;
            for(int j=0;j<blen;j++){
                
                if(b!=null && a!=null && b==a){f=true;break;}
                b=b.next;
            }
            a=a.next;
            if(f)return b;
        }
        }
        else{
            for(int i=0;i<blen;i++){
            a=headA;
            for(int j=0;j<alen;j++){
                if(b!=null && a!=null && b==a){f=true;break;}
                a=a.next;
            }
            b=b.next;
            if(f)return a;
            }
        }
        return null;
    }
    private int getLength(ListNode head) {
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            ++len;
            cur = cur.next;
        }
        return len;
    }
}
