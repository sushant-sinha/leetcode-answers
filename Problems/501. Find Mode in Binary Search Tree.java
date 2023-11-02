// SUSHANT SINHA

// 25ms ( 6.37% ) 52.47ms ( 5.39% )

// straightforward solution...
// need to solve for the Follow up: Could you do that without using any extra space?
// (Assume that the implicit stack space incurred due to recursion does not count).

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

    int ar[]=new int[200001];

    public int[] findMode(TreeNode root) {

        helper(root);

        int maxFreq=0;

        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<ar.length;i++){

            if(ar[i]>maxFreq){
                ans.clear();
                ans.add(i-100000);
                maxFreq=ar[i];
            }

            else if(ar[i]==maxFreq){
                ans.add(i-100000);
            }
        }

        // System.out.println(ans);

        int ret[]=new int[ans.size()];

        for(int i=0;i<ret.length;i++)
            ret[i]=ans.get(i);

        return ret;
        
    }

    void helper(TreeNode root){

        if(root==null)
        return;

        else{
            ar[root.val+100000]++;
            helper(root.right);
            helper(root.left);

        }

    }
}