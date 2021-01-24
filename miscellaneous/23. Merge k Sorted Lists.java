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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0) return null;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0 ; i<lists.length ; i++)
        {
            while(lists[i]!=null)
            {
                arr.add(lists[i].val);
                lists[i]=lists[i].next;
            }
        }
        
        Collections.sort(arr);
        
        ListNode head = new ListNode(0);
        ListNode temp=head;
        for(int i=0 ; i<arr.size() ; i++)
        {
            temp.next=new ListNode(arr.get(i));
            temp=temp.next;
        }
        arr.clear();
        return head.next;
    }
}