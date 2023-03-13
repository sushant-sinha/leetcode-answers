// SUSHANT SINHA

// 0ms ( 100% ) 40.8mb ( 38.72% )

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

//  great explanation: https://leetcode.com/problems/symmetric-tree/solutions/3290198/image-explanation-recursive-non-recursive-complete-intuition/?orderBy=hot

// recur solution
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        if(root==null)
        return true;

        return helper(root.left, root.right);

    }

    boolean helper(TreeNode left, TreeNode right){

        // tree traversal done... reached the leaf node
        if(left==null && right==null)
        return true;

        if((left!=null && right==null) || (left==null && right!=null))
        return false;

        if(left.val!=right.val)
        return false;

        return helper(left.left, right.right) && helper(left.right, right.left);

    }
}