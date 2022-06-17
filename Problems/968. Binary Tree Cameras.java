// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
    
//     int ans=0;
    
//     public int minCameraCover(TreeNode root) {
        
//         //int ans=0;
        
//         // return dfs(root,ans);
        
//         if(dfs(root,ans)==0){}// ans++;
        
//         return ans;
        
//     }
    
//     int dfs(TreeNode root, int ans){
        
//         if(root==null) return 1;
        
//         int left=dfs(root.left, ans);
//         int right=dfs(root.right, ans);
        
//         if(left==0 || right==0){
            
//             //System.out.println("hi"+(++i));
//             ++ans;
//             //System.out.println(ans);
//             return 2;
            
//         }
        
//         if(left==2 && right==2)
//             return 1;
        
//         else
//             return 0;
        
        
//     }
    
// }

class Solution {
    int res = 0;
    public int minCameraCover(TreeNode root) 
    {
        return (dfs(root) < 1 ? 1 : 0) + res;
    }

    public int dfs(TreeNode root) 
    {
        if (root == null) 
        {
            return 2;
        }
        int left = dfs(root.left), right = dfs(root.right);
        if (left == 0 || right == 0) 
        {
            res++;
            return 1;
        }
        return left == 1 || right == 1 ? 2 : 0;
    }
}