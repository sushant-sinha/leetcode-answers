// SUSHANT SINHA

// 0ms ( 100% ) 43.86mb ( 80.83% )

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
    public TreeNode removeLeafNodes(TreeNode root, int target) {

        TreeNode start=root;

        if(traverse(start, target))
            return null;

        return root;
        
    }

    boolean traverse(TreeNode root, int val){

        if(root.left==null && root.right==null){
            if(root.val==val)
                return true;
            else
                return false;
        }

        boolean left=true, right=true;

        if(root.left!=null){
            left=traverse(root.left, val);
            if(left)
                root.left=null;
        }

        if(root.right!=null){
            right=traverse(root.right, val);
            if(right)
                root.right=null;
        }

        if(left && right && root.val==val){
            return true;
        }

        else
            return false;
    }
}