// SUSHANT SINHA

// 363ms ( 5.03% ) 43.1mb ( 89.43% )

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
    
    ArrayList<Integer> seen=new ArrayList<>();
    
    public boolean findTarget(TreeNode root, int k) {
        
        return dfs(root, k);
        
        
    }
    
    boolean dfs(TreeNode root, int k){
        
        int find=k-root.val;
        
        if(seen.contains(find))
            return true;
        
        seen.add(root.val);
        
        boolean left=false, right=false;
        
        if(root.left!=null)
            left=dfs(root.left,k);
        
        if(root.right!=null)
            right=dfs(root.right, k);
        
        return left||right;
        
    }
    
}