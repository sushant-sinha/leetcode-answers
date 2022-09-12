// SUSHANT SINHA

// 13ms ( 5.77% ) 48.3mb ( 16.28% )

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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> ans=new ArrayList<>();
        
        // finding the height of the tree...
        // then traversing level wise
        
        int h=height(root);
        
        // System.out.println(h);
        
        for(int i=1;i<=h;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            temp=dfs(root, i, temp);
            //System.out.println(temp);
            double sum=0;
            for(int x:temp)
                sum+=x;
            
            ans.add(sum/temp.size());
        }
        
        return ans;
        
    }
    
    int height(TreeNode root){
        
        if(root==null)
            return 0;
        
        else{
            
            int left_subtree=height(root.left);
            int right_subtree=height(root.right);
            
            return left_subtree>right_subtree ? left_subtree+1 : right_subtree+1;
            
        }
        
    }
    
    ArrayList<Integer> dfs(TreeNode root, int h, ArrayList<Integer> temp){
        
        if(h==1){
            temp.add(root.val);
        }
        
        else{
            if(root.left!=null)
            dfs(root.left, h-1, temp);
            if(root.right!=null)
            dfs(root.right, h-1, temp);
        }
        
        return temp;
        
    }
}