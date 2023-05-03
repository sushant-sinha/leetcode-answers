// SUSHANT SINHA

// 3ms ( 82.9% ) 43mb ( 18.50% )

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

    // this treemap will map the y coordinate with: another treemap holding the sum of x and y coordinates
    // the second treemap will be used for checking when there are multiple nodes with the same index
    // since the sum of coordinates at a level (y coordinate) is always unique, we can use this as sum as key
    TreeMap<Integer, TreeMap<Integer,ArrayList<Integer>> > map=new TreeMap<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        helper(root, 0, 0);

        List<List<Integer>> ans= new ArrayList<>();

        // traversing outer treemap

        for (Map.Entry<Integer, TreeMap<Integer,ArrayList<Integer>>> mapElement : map.entrySet()) {

            TreeMap<Integer, ArrayList<Integer>> temp=map.get(mapElement.getKey());

            ArrayList<Integer> intermediateAns= new ArrayList<>();

            // traversing inner treemap
            for (Map.Entry<Integer, ArrayList<Integer>> mapElement1 : temp.entrySet()){

                intermediateAns.addAll(temp.get(mapElement1.getKey()));

            }

            ans.add(intermediateAns);
 
        }

        return ans;

    }

    void helper(TreeNode root, int x, int y){

        if(root==null)
        return;

        if(map.containsKey(y)){
            TreeMap<Integer, ArrayList<Integer>> temp=map.get(y);

            // if there are two elements at the same index
            if(temp.containsKey(x+y)){

                ArrayList<Integer> temp1= temp.get(x+y);
                temp1.add(root.val);

                // sorting since elements are at the same index
                Collections.sort(temp1);
                
                temp.put(x+y, temp1);
            }

            // if there are no two elements at the same index, simply put the sum of x+y mapped to its root.val
            else{
                ArrayList<Integer> temp1=new ArrayList<>();
                temp1.add(root.val);
                temp.put((x+y), temp1);
            }
            
            map.put(y, temp);
        }

        // if there is no existing element at the given y coordinate
        else{

            TreeMap<Integer, ArrayList<Integer>> temp=new TreeMap<>();
            ArrayList<Integer> temp1=new ArrayList<>();
            temp1.add(root.val);
            temp.put(x+y, temp1);
            map.put(y, temp);
        }

        helper(root.left, x+1, y-1);
        helper(root.right, x+1, y+1);
        
    }

}