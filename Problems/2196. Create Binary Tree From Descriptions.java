// SUSHANT SINHA

// 90ms ( 14.97% ) 56.70mb ( 22.61% )

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
    public TreeNode createBinaryTree(int[][] descriptions) {

        HashMap<Integer, TreeNode> map=new HashMap<>();

        HashMap<Integer, Boolean> hasParent=new HashMap<>();

        HashSet<Integer> seen=new HashSet<>();

        for(int i[]: descriptions){

            hasParent.put(i[1], true);
            seen.add(i[0]);
            seen.add(i[1]);

            if(i[2]==1){
                if(map.containsKey(i[0])){
                    if(map.containsKey(i[1])){
                        map.get(i[0]).left=map.get(i[1]);
                    }
                    else{
                        TreeNode child=new TreeNode(i[1]);
                        map.get(i[0]).left=child;
                        map.put(i[1], child);
                    }
                }
                else{
                    TreeNode parent=new TreeNode(i[0]);
                    map.put(i[0], parent);
                    if(map.containsKey(i[1])){
                        parent.left=map.get(i[1]);
                    }
                    else{
                        TreeNode child=new TreeNode(i[1]);
                        parent.left=child;
                        map.put(i[1], child);
                    }
                }
            }

            else{
                if(map.containsKey(i[0])){
                    if(map.containsKey(i[1])){
                        map.get(i[0]).right=map.get(i[1]);
                    }
                    else{
                        TreeNode child=new TreeNode(i[1]);
                        map.get(i[0]).right=child;
                        map.put(i[1], child);
                    }
                }
                else{
                    TreeNode parent=new TreeNode(i[0]);
                    map.put(i[0], parent);
                    if(map.containsKey(i[1])){
                        parent.right=map.get(i[1]);
                    }
                    else{
                        TreeNode child=new TreeNode(i[1]);
                        parent.right=child;
                        map.put(i[1], child);
                    }
                }
            }

        }

        TreeNode root=null;

        for(int i:seen){
            if(!hasParent.containsKey(i)){
                root=map.get(i);
            }
        }

        return root;
        
    }
}