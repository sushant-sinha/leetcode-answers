// SUSHANT SINHA

// took hint from indiaCoder

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

/*

given [ 1 2 3 4 5 6 7 8 9],k=2
ans   [ 1 8 3 4 5 6 7 2 9]

firstN = head

after first while loop:
firstN at 2

f = firstN
secondN = head
after second while loop:
we iterate untill
firstN reaches end... making secondN reaching kth position from behind

now just swap firstN and secondN

*/

// 2ms ( 99.89% ) 64.9mb ( 72.01% )

class Solution {
    // TC : O(n)
    // SC : O(1)
    public ListNode swapNodes(ListNode head, int k) {
        k = k-1;
        ListNode firstN = head;
        while(k>0){
            firstN = firstN.next;
            k--;
        }

        ListNode f = firstN;
        ListNode secondN = head;
        while(f.next!=null){
            secondN = secondN.next;
            f = f.next;
        }

        int temp = firstN.val;
        firstN.val = secondN.val;
        secondN.val = temp;

        return head;


    }
}