// SUSHANT SINHA

/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        ListNode temp = node.next;
        node.next = temp.next;
    }
}