// SUSHANT SINHA

// 0ms ( 100% ) 40.2mb ( 33.7% )

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

    int ans=0;

    public int sumNumbers(TreeNode root) {

        helper(root,0);
        return ans;
    }

    void helper(TreeNode root, int temp){

        if(root.left==null && root.right==null){
            ans+=temp*10+root.val;
            // System.out.println((temp*10+root.val));
            return;
        }

        temp=temp*10+root.val;

        if(root.left!=null)
        helper(root.left, temp);

        if(root.right!=null)
        helper(root.right, temp);

    }
}