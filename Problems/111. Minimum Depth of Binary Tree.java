// SUSHANT SINHA

// 9ms ( 69.59% ) 62.3mb ( 53.91% )

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

    int ans=Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {

        /*
        no need of if condition, this is already handled in the helper function
        but... need to add null case check in the return statement

        if(root==null)
            return 0;

        */

        helper(root, 0);
        return ans==Integer.MAX_VALUE ? 0 : ans;
        
    }

    void helper(TreeNode root, int curDepth){

        if(root!=null){
            if(root.left==null && root.right==null){
                ans = ans < curDepth+1 ? ans : curDepth+1;
                return;
            }

            else{
                helper(root.left, curDepth+1);
                helper(root.right, curDepth+1);
            }
        }

    }
}