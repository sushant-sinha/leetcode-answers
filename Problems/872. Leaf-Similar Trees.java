// SUSHANT SINHA

// 1ms ( 77.58% ) 42mb ( 36.40% )

// the commented code fails when the test cases are [1] and [1]
// it passes in the "run" section but fails when this test case is tested in the "submit"

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
//  */
// class Solution {

//     static List<Integer> ar1=new ArrayList<>();
//     static List<Integer> ar2=new ArrayList<>();

//     public boolean leafSimilar(TreeNode root1, TreeNode root2) {

//         helper1(root1);
//         helper2(root2);

//         return ar1.equals(ar2);
        
//     }

//     static void helper1(TreeNode root1){

//         if(root1==null)
//             return;

//         if(root1.left==null && root1.right==null){
//             ar1.add(root1.val);
//             return;
//         }

//         helper1(root1.left);
//         helper1(root1.right);

//     }

//     static void helper2(TreeNode root2){

//         if(root2==null)
//             return;

//         if(root2.left==null && root2.right==null){
//             ar2.add(root2.val);
//             return;
//         }

//         helper2(root2.left);
//         helper2(root2.right);

//     }
// }

class Solution {
    private void generate(List<Integer> res ,TreeNode node){
        if(node==null){
            return;
        }
        if(node.left==null&&node.right==null){
            res.add(node.val);
            return;
        }
        generate(res,node.left);
        generate(res,node.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        generate(list1,root1);
        generate(list2,root2);
        return list1.equals(list2);
        
    }
}