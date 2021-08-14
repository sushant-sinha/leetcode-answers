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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode ans=list1;
        ListNode x=list1;
        int i=1;
        
        while(list1.next!=null && i!=a){
            i++;
            list1=list1.next;
        }
        
        i=-1;
        
        while(x.next!=null && i!=b){
            i++;
            x=x.next;
        }
                
        list1.next=list2;
        
        while(list2.next!=null){
            list2=list2.next;
        }
        
        list2.next=x;
        
        return ans;
        
    }
}