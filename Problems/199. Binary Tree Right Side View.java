// SUSHANT SINHA

// 1ms ( 94.70% ) 42.9mb ( 31.16% )

/*

got the intuition to do this question using the wrong submission in:

102. Binary Tree Level Order Traversal

*/


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
    
    List<Integer> ans=new ArrayList<>();
    
    public List<Integer> rightSideView(TreeNode root) {
        
        dfs(root, 0);
        
        return ans;
        
    }
    
    void dfs(TreeNode root, int level){
        
        if(root==null)
            return;
        
        
        if(level==ans.size())
            ans.add(root.val);
        
        dfs(root.right, level+1);
        dfs(root.left, level+1);
        
    }
}