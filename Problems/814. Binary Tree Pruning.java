// best solution

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return root;
        boolean left = true, right = true;
        if(root.left != null){
            left = pruneNode(root.left);
            if(left) root.left = null;
        }
        if(root.right != null){
            right = pruneNode(root.right);
            if(right) root.right = null;
        }
        if(left && right && root.val == 0){
            root = null;
        }
        return root;
    }
    private boolean pruneNode(TreeNode node){
        if(node.val == 0 && node.left == null && node.right == null) return true;
        else{
            boolean left = true, right = true;
            if(node.left != null){
                left = pruneNode(node.left);
                if(left) node.left = null;
            }
            if(node.right != null){
                right = pruneNode(node.right);
                if(right) node.right = null;
            }
            return (left && right) && node.val == 0;
        }
    }
}