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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        
        // return false;
        return recur(p, q);
        
    }

    boolean recur(TreeNode p, TreeNode q){

        boolean leftTree=true, rightTree=true;
        // checking if both of them are having a node or not
        if(p!=null && q!=null){

            if(p.val!=q.val)
            return false;

            leftTree=recur(p.left, q.left);
            rightTree=recur(p.right, q.right);

        }

        else if(p==null && q==null){
            return true;
        }

        else
        return false;

        return leftTree && rightTree;

    }
}