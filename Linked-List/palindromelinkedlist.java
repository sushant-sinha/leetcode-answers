// SUSHANT SINHA
public class Solution {
    public boolean isPalindrome(ListNode head) {
        // get the length of the linked list.
        // reverse half of the linked list.
        // compare and reverse back.
        
        // get the length of the linked list
        if (head == null || head.next == null) return true;
        int n = 0; 
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            n ++;
        }
        cur = head;
        for (int i = 0; i < n/2 - 1; i ++) cur = cur.next;
        
        // get the head of the second half        
        ListNode secondHead = null;
        if (n % 2 == 0) secondHead = cur.next;
        else secondHead = cur.next.next;
        
        secondHead = reverse(secondHead);
        ListNode cur1 = head;
        ListNode cur2 = secondHead;
        boolean result = true; // must initialize !
        while (cur2 != null) {
            if (cur1.val != cur2.val) {
                result = false;
                break;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        secondHead = reverse(secondHead);
        return result;
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null; 
        ListNode cur = head;
        while (cur != null) {
            ListNode nextCur = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextCur;
        }
        return prev;
    }
}