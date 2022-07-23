// SUSHANT SINHA

// 1ms ( 92.53% ) 42mb ( 98.91% )

// couldn't solve

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

// class Solution {
    
//     List<List<Integer>> ans=new ArrayList<>();
    
    
//     public List<List<Integer>> levelOrder(TreeNode root) {
        
//         dfs(root, 0);
        
//         return ans;
        
//     }
    
//     void dfs(TreeNode root, int level){
        
//         if(root==null)
//             return;
        
//         ArrayList<Integer> temp= new ArrayList<>();
        
//         if(level==ans.size())
//             ans.add(temp);
        
//         temp.add(root.val);
        
//         dfs(root.right, level+1);
//         dfs(root.left, level+1);
        
//     }
// }

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> res1 = new ArrayList<>();
            for(int i = 0;i<n;i++){
                if(q.peek().left != null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right != null){
                    q.offer(q.peek().right);
                }
                res1.add(q.poll().val);
            }
            res.add(res1);
        }
        return res;
    }
}