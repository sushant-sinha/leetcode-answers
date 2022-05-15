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