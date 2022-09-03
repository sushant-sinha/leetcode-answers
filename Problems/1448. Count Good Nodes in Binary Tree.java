// SUSHANT SINHA

// 2ms ( 100% ) 50.8mb ( 88.42% )

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
    
    public int goodNodes(TreeNode root) {
        
        dfs(root, -10001);
        
        return ans;
        
    }
    
    void dfs(TreeNode node, int max){
        
        if(node==null)
            return;
        
        else if(!(max>node.val)){
            
            ans++;
            max=node.val;
            
        }
        
        dfs(node.left, max);
        dfs(node.right, max);
        
        
        
    }
}