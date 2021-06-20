// SUSHANT SINHA

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root);
    
        return list.get(k - 1);
    }
    
    public void inorderTraversal(TreeNode node)
    {
        if(node == null)
            return;
        
        if(node.left != null)
            inorderTraversal(node.left);
        
        list.add(node.val);
        
        if(node.right != null)
            inorderTraversal(node.right);
    }
}

