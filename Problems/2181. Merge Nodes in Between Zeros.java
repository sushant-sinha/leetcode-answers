// SUSHANT SINHA

// 7ms ( 97.76% ) 86.1mb ( 88.85% )

// refer this https://leetcode.com/problems/delete-node-in-a-linked-list/discuss/654837/listnode-class-implementation-for-java
// for using ListNode class

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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode ans=new ListNode();
        // here, in ans, the first node will have zero as the val, because the brackets are empty
        // to cover this, in return, ans.next is used
        
        ListNode temp=ans;
        
        while(head.next!=null){
            
            //System.out.println("-------");
            head=head.next;
            
            int tempSum=0;
            
            while(head!=null && head.val!=0){
                
                tempSum+=head.val;
                head=head.next;
            }
            
            //System.out.println(tempSum);
            
            temp.next=new ListNode(tempSum);
            temp=temp.next;
        }
        
        return ans.next;
        
    }
}

// if not using tempSum, and just updating the node value
// 12ms ( 57.35% ) 309mb ( 20.23% )

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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode ans=new ListNode();
        ListNode temp=ans;
        
        while(head.next!=null){
            
            head=head.next;
            
            temp.next=new ListNode(0);
            
            while(head!=null && head.val!=0){
                
                temp.next.val+=head.val;
                head=head.next;
            }
            
            temp=temp.next;
        }
        
        return ans.next;
        
    }
}

// best solution from the submission section
// 6ms

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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = head;
        ListNode dummyHead = head, previousNode = null;
        head = head.next;
        int total = 0;
        
        while(head != null) {
            if(head.val == 0) {
                dummy.val = total;
                previousNode = dummy;
                dummy = dummy.next;
                total = 0;
            } else {
                total += head.val;
            }
            head = head.next;
        }
        previousNode.next = null;
        return dummyHead;
    }
}