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

    // map the level with the elements
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    // TreeNode root1;
    public TreeNode reverseOddLevels(TreeNode root) {

        fillMap(root, 0);

        // root1=root;

        // for(Map.Entry<Integer, ArrayList<Integer>> e: map.entrySet()){
        //     System.out.println("level = "+e.getKey()+ " nums = "+e.getValue());
        // }

        generateNewTree(root, 0);

        return root;
        
    }

    void generateNewTree(TreeNode root, int level){

        if(root==null)
            return;

        if(level%2==1){
            ArrayList<Integer> levelValues=map.get(level);

            root.val=levelValues.get(0);

            levelValues.remove(0);

            map.put(level, levelValues);
        }

        generateNewTree(root.right, level+1);
        generateNewTree(root.left, level+1);
    }

    void fillMap(TreeNode root, int level){

        if(root==null)
            return;

        if(level%2==1){
            ArrayList<Integer> temp;

            // save these elements
            if(map.containsKey(level))
                temp=map.get(level);
            
            else
                temp=new ArrayList<>();
            
            temp.add(root.val);
            map.put(level, temp);

        }

        fillMap(root.left, level+1);
        fillMap(root.right, level+1);
    }
}