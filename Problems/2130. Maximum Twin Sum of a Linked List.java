// SUSHANT SINHA

// 20ms ( 14.29% ) 126.1mb ( 14.29% )

/* 

to find the mid of the linkedlist....

i will make a pointer which traverses the linkedlist with x2 speed
meanwhile... another pointer whill traverse the list with x1 speed and store the visited node's value in an arraylist

when the speedX2 pointer reaches the end.. this means the speed pointer is currently in the middle of the list..

---------------

from now on... we will make another while loop..
it will use the speed pointer to traverse the remaining half of the linkedlist

simulataneously when the speed pointer traverses the second half.. we will generate the sum by adding speed.val with the reverse arraylist

return the max sum

*/


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