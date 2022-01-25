class Solution {
    public int minimumCost(int[] cost) {
        
        Arrays.sort(cost);
        
        int ans=0;
        
        for(int i=cost.length-1;i>=0;i--){
            
            ans+=cost[i];
            
            if(--i>=0)
                ans+=cost[i];
            
            --i;
            
        }
        
        return ans;
        
    }
}