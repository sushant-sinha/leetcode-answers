/*
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
/*
class Solution {
    
    boolean ans=true;
    
    public boolean isValidBST(TreeNode root) {
        
        bfs(root, root.val);
        
        return ans;
        
    }
    
    void bfs(TreeNode root, int val){
        
        if(root.left!=null){
            
            if(root.left.val>=val){
                ans=false;
                return;
            }
            
            else
                bfs(root.left, root.left.val);
            
        }
        
        if(root.right!=null){
            
            if(root.right.val<=val){
                ans=false;
                return;
            }
            
            else
                bfs(root.right, root.right.val);
        }
        
        else
            return;
        
    }
    
}

*/

class Solution {
    private boolean flag=true;
    TreeNode prev=null;
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return flag;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        
        inorder(root.left);
        
        if(prev!=null && root.val<=prev.val){
            flag=false;
            return;
        }
        prev=root;
        
        inorder(root.right);
    }
}