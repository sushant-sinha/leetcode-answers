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

    public int averageOfSubtree(TreeNode root) {

        helper(root);
        return ans;   
    }


    int[] helper(TreeNode root){

        if(root==null)
        return new int[]{0,0};

        int[] left=helper(root.left);
        int[] right=helper(root.right);

        int total=left[0]+right[0]+root.val;
        int freq=left[1]+right[1]+1;

        // System.out.println("for "+root.val+" left="+Arrays.toString(left)+" right="+Arrays.toString(right)+ " avg="+(total/freq));

        ans+= (total/freq) == root.val ? 1 : 0;

        return new int[]{total, freq};
    }
}