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
    
    int min1=Integer.MAX_VALUE;
    int min2=Integer.MAX_VALUE;
    
    boolean flag=false;
    
    // min1 is the minimum value, min2 is the second smallest value
    
    public int findSecondMinimumValue(TreeNode root) {
        
        dfs(root);
        
        // System.out.println(min1+" "+min2);
        
        return min2 == Integer.MAX_VALUE && !flag ? -1 : min2;
        
    }
    
    void dfs(TreeNode root){
        
        if(root==null)
            return;
        
        if(root.val<min1){
            min2=min1;
            min1=root.val;
        }
        
        if(root.val>min1 && root.val<=min2){
            flag=true;
            min2=root.val;
        }
        
        // if the left node is null... then there wont be right sub-tree also
        
        if(root.left==null)
            return;
        
        else{
            dfs(root.left);
            dfs(root.right);
        }
        
        return;
        
        
    }
}