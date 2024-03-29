// do again (because it uses poll function)
// https://leetcode.com/problems/deepest-leaves-sum/discuss/463239/JavaC%2B%2BPython-Level-Traversal

// 12ms ( 18.92% ) 58.8mb ( 32.09% )

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
    public int deepestLeavesSum(TreeNode root) {
     
        int ans = 0, i;
        
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        
        q.add(root);
        
        while (!q.isEmpty()) {
            
            for (i = q.size() - 1, ans = 0; i >= 0; --i) {
                
                // This function returns the first element (head) of the linked list if there are elements in the list, and if the list is empty, it returns null.
                
                TreeNode node = q.poll();
                ans+=node.val;
                
                if (node.right != null)
                    q.add(node.right);
                
                if (node.left  != null)
                    q.add(node.left);
                
            }
        }
        
        return ans;
        
    }
}

// another approach in the comment section of the solution post using the Queue

public int deepestLeavesSum(TreeNode root) {
    Queue<TreeNode> q=new LinkedList<>();
    int sum=0;
    q.offer(root);
    while(!q.isEmpty()) {
        int size=q.size();
        sum=0;
        for(int i=0;i<size;i++) {
            TreeNode cur=q.poll();
            sum+=cur.val;
            if(cur.left!=null) q.offer(cur.left);
            if(cur.right!=null) q.offer(cur.right);
        }
    }
    return sum;
}