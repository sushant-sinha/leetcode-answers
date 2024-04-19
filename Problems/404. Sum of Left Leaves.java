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

    public int sumOfLeftLeaves(TreeNode root) {

        traverse(root);

        return ans;
        
    }

    void traverse(TreeNode root){

        if(root.left!=null){

            // check if this left node is leaf or not

            if(root.left.left==null && root.left.right==null){
                ans+=root.left.val;
            }

            else{
                traverse(root.left);
            }
        }

        if(root.right!=null){
            traverse(root.right);
        }
    }
}