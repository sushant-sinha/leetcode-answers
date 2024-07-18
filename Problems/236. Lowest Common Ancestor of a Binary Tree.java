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

    HashMap<Integer, TreeNode> nodeToParent=new HashMap<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        traverse(root, null);

        HashSet<TreeNode> ancestors=new HashSet<>();
        ancestors.add(p);

        TreeNode parent=nodeToParent.get(p.val);
        
        while(parent!=null){

            ancestors.add(parent);
            parent=nodeToParent.get(parent.val);
    
        }

        parent=q;
        while(!ancestors.contains(parent)){
            parent=nodeToParent.get(parent.val);
        }

        return parent;
        
    }

    void traverse(TreeNode root, TreeNode parent){

        if(root==null)
            return;

        nodeToParent.put(root.val, parent);

        traverse(root.left, root);
        traverse(root.right, root);
    }
}