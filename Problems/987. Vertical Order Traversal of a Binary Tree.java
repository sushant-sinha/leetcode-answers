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

    TreeMap<Integer, TreeMap<Integer,ArrayList<Integer>> > map=new TreeMap<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        helper(root, 0, 0);

        List<List<Integer>> ans= new ArrayList<>();

        // ArrayList<Integer> temp;

        // traversing treemap

        for (Map.Entry<Integer, TreeMap<Integer,ArrayList<Integer>>> mapElement : map.entrySet()) {
            // String key = mapElement.getKey();

            TreeMap<Integer, ArrayList<Integer>> temp=map.get(mapElement.getKey());

            ArrayList<Integer> intermediateAns= new ArrayList<>();

            for (Map.Entry<Integer, ArrayList<Integer>> mapElement1 : temp.entrySet()){

                intermediateAns.addAll(temp.get(mapElement1.getKey()));

            }

            // Collections.sort(temp);

            ans.add(intermediateAns);
 
        }

        return ans;

    }

    void helper(TreeNode root, int x, int y){

        if(root==null)
        return;

        if(map.containsKey(y)){
            TreeMap<Integer, ArrayList<Integer>> temp=map.get(y);
            
            if(temp.containsKey(x+y)){
                ArrayList<Integer> temp1= temp.get(x+y);
                temp1.add(root.val);
                Collections.sort(temp1);
                
                temp.put(x+y, temp1);
            }

            else{
                ArrayList<Integer> temp1=new ArrayList<>();
                temp1.add(root.val);
                temp.put((x+y), temp1);
            }
            
            map.put(y, temp);
        }

        else{
            TreeMap<Integer, ArrayList<Integer>> temp=new TreeMap<>();
            ArrayList<Integer> temp1=new ArrayList<>();
            temp1.add(root.val);
            temp.put(x+y, temp1);
            map.put(y, temp);
        }

        // System.out.println(root.val+" "+map);

        helper(root.left, x+1, y-1);
        helper(root.right, x+1, y+1);
        
    }

}