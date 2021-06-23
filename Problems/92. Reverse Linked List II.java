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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode head1=new ListNode();
        
        int ar[]=new int[right-left+1];
        int i=0,counter=1;
        
        head1=head;
        
        while(counter!=left){
            
            counter++;
            head1=head1.next;
        }
        
        while(counter!=right){
                        
            ar[i++]=head1.val;
            head1=head1.next;
            counter++;
            
        }
        
        ar[i]=head1.val;
        
        
        // reversing
        
        for(int j=0;j<ar.length/2;j++){
            int temp=ar[j];
            ar[j]=ar[ar.length-j-1];
            ar[ar.length-j-1]=temp;
        }
        
        i=0;counter=1;
        head1=head;
        
        while(head1!=null && counter!=left){
            
            counter++;
            head1=head1.next;
        }
        
        while(counter!=right){
            
            head1.val=ar[i++];
            head1=head1.next;
            counter++;
            
        }
        
        head1.val=ar[i];
        
        return head;
        
    }
}