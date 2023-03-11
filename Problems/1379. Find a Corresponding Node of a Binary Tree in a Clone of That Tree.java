// SUSHANT SINHA

// 11ms ( 7.99% ) 49.6mb ( 89.90% )

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    HashMap<Integer, TreeNode> temp=new HashMap<>();

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        help(cloned);

        return temp.get(target.val);
    }

    void help(TreeNode root){

        if(root==null)
        return ;

        else
        temp.put(root.val, root);

        help(root.left);
        help(root.right);
    }

}