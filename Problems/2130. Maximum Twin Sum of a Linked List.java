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
    public int pairSum(ListNode head) {
        
        // this arraylist stores the values in the first half of the linkedlist
        ArrayList<Integer> firstHalf=new ArrayList<>();
        
        ListNode speed=head;
        ListNode speedX2=head;
        
        int ans=0;
        
        while(speedX2!=null){
            
            firstHalf.add(speed.val);
            
            speed=speed.next;
            
            speedX2=speedX2.next.next;
            
        }
        
        // variables needed to traverse the arraylist in reverse
        int counter=0, halfLen=firstHalf.size();
        
        while(speed!=null){
            
            //System.out.println(speed.val+" "+firstHalf.get(halfLen-counter-1));
            
            ans= ans>(speed.val+firstHalf.get(halfLen-counter-1)) ? ans : (speed.val+firstHalf.get(halfLen-counter-1));
            
            counter++;
            
            speed=speed.next;
        
        }
        
        return ans;
    }
}