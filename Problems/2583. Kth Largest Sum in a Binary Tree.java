class Solution {
    List<Long> list = new ArrayList<>();
    public long kthLargestLevelSum(TreeNode root, int k) {
        collectSum(root,0);
        
        PriorityQueue<Long> pq = new PriorityQueue<>((a,b)->Long.compare(b,a));
        pq.addAll(list);

        if(pq.size() < k)
            return -1;
        
        while(k-- > 1)
            pq.poll();
            
        return pq.poll();
    }
    void collectSum(TreeNode root, int level){
        if(root == null)
            return;
        
        if(level == list.size())
            list.add((long)root.val);
        
        else
            list.set(level,list.get(level)+root.val);

        collectSum(root.left, level+1);
        collectSum(root.right, level+1);
        
    }
}