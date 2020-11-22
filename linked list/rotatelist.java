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
  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || k == 0) {
      return head;
    }
    int listSize = 0;
    ListNode curr = head;
    while (curr != null) {
      curr = curr.next;
      listSize++;
    }
    k %= listSize;
    if (k == 0) {
      return head;
    }
    k = listSize - k;
    curr = head;
    while (k-- > 1) {
      curr = curr.next;
    }
    ListNode newHead = curr.next;
    curr.next = null;
    curr = newHead;
    while (curr != null && curr.next != null) {
      curr = curr.next;
    }
    curr.next = head;
    return newHead;
      //time limit exceeded answer
    //   if (head == null || k == 0) return head;
    // int listsize = 0;
    // ListNode cur = head;
    // while (cur!= null) {
    //   cur = cur.next;
    //   listsize++;
    // }
    //   int arr[]=new int[listsize];
    //   int i=0;
    //   cur=head;
    //   while(cur!=null){arr[i++]=cur.val;cur=cur.next;}
    //   int ans[]=new int[listsize];
    //   for(i=0;i<k;i++){
    //       ans[0]=arr[listsize-1];
    //       for(int j=0;j<(listsize-1);j++){
    //           ans[j+1]=arr[j];
    //       }
    //       for(int l=0;l<listsize;l++)arr[l]=ans[l];
    //   }i=0;cur=head;
    //   while(cur!=null){
    //       cur.val=arr[i];i++;cur=cur.next;
    //   }
    //   return head;
  }
}
