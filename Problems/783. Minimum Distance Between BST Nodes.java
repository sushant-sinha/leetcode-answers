// SUSHANT SINHA

// 2ms ( 9.52% ) 40.1mb ( 35.81% )

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

    TreeSet<Integer> set=new TreeSet<>();
    int min=Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {

        // this was originally when the question expects to find the minimum difference between any child-parent pair
        // return helper(root, Integer.MAX_VALUE);

        set.add(root.val);
        
        if(root.right!=null)
        helper(root.right);

        if(root.left!=null)
        helper(root.left);

        return min;

    }

    void helper(TreeNode root){

        if(root==null)
        return;

        int val=root.val;

        if(set.floor(val)!=null){
            min=Math.min( Math.abs(root.val-set.floor(val)), min );
        }

        if(set.ceiling(val)!=null){
            min=Math.min( Math.abs(root.val-set.ceiling(val)), min );
        }

        set.add(val);

        helper(root.left);
        helper(root.right);

    }

    // the below helper will be used for finding the minimum difference between any parent child pair
    // int helper(TreeNode root, int min){

    //     if(root==null)
    //     return min;

    //     if(root.left!=null){
    //         min= Math.min(Math.abs(root.val-root.left.val), min);
    //     }

    //     if(root.right!=null){
    //         min= Math.min(Math.abs(root.val-root.right.val), min);
    //     }

    //     return Math.min( helper(root.left, min) , helper(root.right, min));

    // }

}