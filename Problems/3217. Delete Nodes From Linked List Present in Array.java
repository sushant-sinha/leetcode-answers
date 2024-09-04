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
    public ListNode modifiedList(int[] nums, ListNode head) {

        ListNode answer=new ListNode();
        ListNode cur=new ListNode();
        cur.next=head;

        HashSet<Integer> numsSet=new HashSet<>();

        for(int i: nums)
            numsSet.add(i);

        answer.next=null;

        boolean foundNewHead=false;

        while(head!=null){

            // System.out.println("in for value: "+head.val);

            if(!numsSet.contains(head.val)){
                cur.next=head;
                cur=head;

                if(!foundNewHead){
                    answer.next=head;
                    foundNewHead=true;
                }
            }


            head=head.next;
        }

        cur.next=null;

        return answer.next;
        
    }
}