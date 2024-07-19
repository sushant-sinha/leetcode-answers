// SUSHANT SINHA

// 10ms ( 12.28% ) 46.73mb ( 5.52% )

// need to optimize the search and traversal😝

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

        // traverse from node p to root
        TreeNode parent=nodeToParent.get(p.val);
        
        while(parent!=null){

            ancestors.add(parent);
            parent=nodeToParent.get(parent.val);
    
        }

        // traverse from node q to root and find the common element

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