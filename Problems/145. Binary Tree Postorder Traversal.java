// SUSHANT SINHA

// trivial solution
// 0ms ( 100% ) 41.56mb ( 45.11% )

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

    List<Integer> ans = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {

        traverse(root);


        return ans;
        
    }

    void traverse(TreeNode root){

        if(root==null)
            return;

        // if(root.left!=null){
            traverse(root.left);
        // }

        // if(root.right!=null){
            traverse(root.right);
        // }

        ans.add(root.val);
    }
}