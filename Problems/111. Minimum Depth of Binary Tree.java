// SUSHANT SINHA

// 10ms ( 58.17% ) 62.7mb ( 23.56% )

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

        if(root==null)
            return 0;

        helper(root, 0);
        return ans;
        
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