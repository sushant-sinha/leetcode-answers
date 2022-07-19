// SUSHANT SINHA

// 1ms ( 62.82% ) 67.5mb ( 29.42% )

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
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if(root==null)
            return 0;
        
        if(root.val>=low && root.val<=high){
            ans+=root.val;
        }
        
        rangeSumBST(root.left, low, high);
        rangeSumBST(root.right, low, high);
        
        return ans;
        
    }
}