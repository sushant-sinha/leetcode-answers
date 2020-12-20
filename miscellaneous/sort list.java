// SUSHANT SINHA

We are using an arraylist to store all the values present in the linkedlist..
Then we use Collections.sort() to sort our arraylist....
Then we can just assign the values of our sorted arraylist to the linkedlist 
Please upvote if it helped 😊

```
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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> x=new ArrayList<Integer>();
        ListNode y=head;
        while(y!=null){
            
            x.add(y.val);
            y=y.next;
            
        }
        
        Collections.sort(x);
        y=head;
        int i=0;
        
        while(y!=null){
            y.val=x.get(i++);
            y=y.next;
        }
        
        return head;
    }
}
