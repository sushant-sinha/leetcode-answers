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

    // mapping the level and the sum
    HashMap<Integer, Integer> sum=new HashMap<>();

    public TreeNode replaceValueInTree(TreeNode root) {
        
        // root, level
        DFS(root.right, 1);
        DFS(root.left, 1);

        DFSfill(root, 1);

        root.val=0;

        return root;
    }

    void DFSfill(TreeNode root, int level){

        if(root.right!=null){
            if(root.left!=null){
                root.right.val=sum.get(level)-root.right.val-root.left.val;
                root.left.val=root.right.val;

                DFSfill(root.right, level+1);
                DFSfill(root.left, level+1);
            }

            else{
                root.right.val=sum.get(level)-root.right.val;
                DFSfill(root.right, level+1);
            }
        }

        else{
            if(root.left==null)
            return;

            else{
                root.left.val=sum.get(level)-root.left.val;
                DFSfill(root.left, level+1);
            }
        }

        return;

    }

    void DFS(TreeNode root, int level){

        if(root==null)
        return;

        // int curSum=sum.get(level)

        sum.put(level, sum.getOrDefault(Integer.valueOf(level),0)+root.val);

        DFS(root.right, level+1);
        DFS(root.left, level+1);

    }
}