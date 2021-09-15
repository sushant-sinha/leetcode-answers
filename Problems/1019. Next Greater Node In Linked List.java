// SUSHANT SINHA

// 781ms ( 27.16% ) 72.1mb ( 15.02% )

// not the expected solution U_U
// traversing the whole linked-list to find the length of list
// iterating linked-list again, and for each element, scan the whole list for the next bigger number.


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
    public int[] nextLargerNodes(ListNode head) {
        
        int len=0;
        
        ListNode counter=new ListNode();
        
        counter=head;
        
        while(counter!=null){
            len++;
            counter=counter.next;
        }
        
        int ans[]=new int[len];
        
        for(int i=0;i<len;i++){
                        
            int value=head.val;
            
            ListNode temp=head;
                        
            while(temp!=null){
                
                if(temp.val>value){
                    ans[i]=temp.val;
                    break;
                }
                             
                temp=temp.next;
            }

            head=head.next;
        }
        
        return ans;
        
    }
}