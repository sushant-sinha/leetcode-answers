// SUSHANT SINHA

// 0ms ( 100% ) 40.15mb ( 85.04% )

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

    TreeNode root=new TreeNode();
    // root.left=null;
    // root.right=null;

    public TreeNode bstFromPreorder(int[] preorder) {

        root.val=preorder[0];

        for(int i=1;i<preorder.length;i++){
            helper(preorder[i]);
        }

        return root;
        
    }

    void helper(int v){

        TreeNode temp=new TreeNode();
        temp.val=v;

        TreeNode root1=root;

        while(true){
            if(root1.val<v){
                if(root1.right==null){
                    root1.right=temp;
                    break;
                }
                else{
                    root1=root1.right;
                }
            }

            else{
                if(root1.left==null){
                    root1.left=temp;
                    break;
                }
                else{
                    root1=root1.left;
                }
            }
        }

        return;
    }
}