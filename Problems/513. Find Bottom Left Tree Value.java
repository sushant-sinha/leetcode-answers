// SUSHANT SINHA

// 0ms ( 100% ) 43.29% ( 78.06% )

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

    int depth=0;

    int val=0;

    public int findBottomLeftValue(TreeNode root) {

        val=root.val;

        helper(root, 0);

        return val;
        
    }

    void helper(TreeNode root, int level){
        
        // System.out.println("val = "+val+" level = "+level);

        if(level>depth){
            depth++;
            val=root.val;
        }

        
        if(root.left!=null)
            helper(root.left, level+1);

        if(root.right!=null)
            helper(root.right, level+1);

    }
}