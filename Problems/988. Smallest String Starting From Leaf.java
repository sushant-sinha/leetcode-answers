// SUSHANT SINHA

// 8ms ( 39.83% ) 44.96mb ( 32.08% )

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

    // its ASCII value is just more than z, so this will always be updated
    String ans="{";

    public String smallestFromLeaf(TreeNode root) {

        ArrayList<TreeNode> nodes=new ArrayList<>();

        nodes.add(root);

        traverse(root, "");

        return ans;
        
    }

    // tried using StringBuffer for making the append operations faster, but that just broke the code
    // so sticking with String for now

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