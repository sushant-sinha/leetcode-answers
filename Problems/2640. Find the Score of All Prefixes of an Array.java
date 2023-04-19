class Solution {
    public long[] findPrefixScore(int[] nums) {
        
        long ans[]=new long[nums.length];
        
        ans[0]=2*nums[0];
        
        long curMax=nums[0];
        
        for(int i=1;i<nums.length;i++){
            
            curMax= curMax<nums[i] ? nums[i] : curMax;
            
            ans[i]= ans[i-1]+nums[i]+curMax;
            
        }
        
        return ans;
        
    }
}