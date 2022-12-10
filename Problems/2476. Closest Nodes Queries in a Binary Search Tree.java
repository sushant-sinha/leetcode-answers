// SUSHANT SINHA

// 237ms ( 25% ) 93.7mb ( 100% )

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
    
    TreeSet<Integer> allVal=new TreeSet<>();
    
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        
        helper(root);
        
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i: queries){
            
            ArrayList<Integer> temp=new ArrayList<>();
            
            if(allVal.floor(i)!=null){
                temp.add(allVal.floor(i));
            }
            
            else
                temp.add(-1);
            
            if(allVal.ceiling(i)!=null){
                temp.add(allVal.ceiling(i));
            }
            
            else
                temp.add(-1);
            
            ans.add(temp);
            
        }
        
        return ans;
        
    }
    
    void helper (TreeNode root){
        
        if(root==null)
            return;
        
        allVal.add(root.val);
        
        helper(root.left);
        helper(root.right);
        
    }
    
}