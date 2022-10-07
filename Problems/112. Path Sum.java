// SUSHANT SINHA

// 0ms ( 100% ) 41.8mb ( 98.94% )

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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root==null)
            return false;
        
        boolean ans=dfs(root,0,targetSum);
        
        return ans;
        
    }
    
    boolean dfs(TreeNode root, int curSum, int target){
        
        curSum+=root.val;
        
        if(root.left==null && root.right==null && curSum==target)
            return true;
        
        if(root.left==null && root.right==null && curSum!=target)
            return false;
        
        //System.out.println(curSum+" "+root.val);
        
        boolean left=false, right=false;
        
        if(root.left!=null)
            left=dfs(root.left, curSum, target);
        
        if(root.right!=null)
            right=dfs(root.right, curSum, target);
        
        return  left || right;
        
    }
}