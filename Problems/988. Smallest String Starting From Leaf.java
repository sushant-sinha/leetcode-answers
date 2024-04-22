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

    String ans="{";

    public String smallestFromLeaf(TreeNode root) {

        ArrayList<TreeNode> nodes=new ArrayList<>();

        nodes.add(root);

        traverse(root, "");

        return ans;
        
    }

    void traverse(TreeNode root, String temp){

        temp=(char)('a'+root.val)+temp;

        // if it is a leaf node
        if(root.left==null && root.right==null){

            ans= ans.compareTo(temp)>0 ? temp : ans;

        }

        else{

            if(root.left!=null){
                traverse(root.left, temp);
            }

            if(root.right!=null){
                traverse(root.right, temp);
            }
        }

    }
}