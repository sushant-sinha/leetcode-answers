// SUSHANT SINHA

// 5ms ( 100% ) 52.4mb ( 97.62% )

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
    int ans=0;

    public int longestZigZag(TreeNode root) {

        if(root.left==null && root.right==null)
        return 0;

        // helper(node, direction, curValue)
        // direction=1 means we will be going towards right
        if(root.left!=null)
        helper(root.left,1,1);

        if(root.right!=null)
        helper(root.right,0,1);

        return ans==0 ? 1 : ans;
        
    }

    void helper(TreeNode root, int dir, int curValue){

        if(root==null)
        return;

        // if(dir==1) we expect right node to have something
        if(dir==1){
            // System.out.println("searching in right");
            if(root.left!=null){
                if(root.left.right!=null)
                helper(root.left.right,0,2);

                if(root.left.left!=null)
                helper(root.left.left,1,1);
            }

            if(root.right!=null){
                curValue++;
                ans=ans>curValue ? ans : curValue;
                // helper(root.right,1,curValue);
                helper(root.right,0,curValue);
            }
        }

        else{
            // System.out.println("searching in left");
            if(root.right!=null){
                if(root.right.right!=null)
                helper(root.right.right,0,1);

                if(root.right.left!=null)
                helper(root.right.left,1,2);
            }

            if(root.left!=null){
                curValue++;
                ans=ans>curValue ? ans : curValue;
                helper(root.left,1,curValue);
                // helper(root.left,0,curValue);
            }

        }

        return;

    }

}

/*

for tree (tc 58/58)

                1
            1        1
        1               1

        all the conditions written inside the helper function will fail
        
        so we have to add a condition to check whether the anas is zero or not

        if it is 0... we will make it as one because the tree consisits of atleast one more than one element and can thus form a zig zag pattern of length 1 at least
*/