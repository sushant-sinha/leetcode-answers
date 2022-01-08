import java.util.Random;

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
    
    ArrayList<Integer> ar=new ArrayList<>();

    public Solution(ListNode head) {
        
        while(head!=null){
            
            ar.add(head.val);
            
            head=head.next;
            
        }
        
    }
    
    public int getRandom() {
        
        //System.out.println(ar.size());
        
        if(ar.size()==1)
            return ar.get(0);
        
        else{
            
            Random r=new Random();
            int index=r.nextInt(ar.size());

            return ar.get(index);
        }
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */