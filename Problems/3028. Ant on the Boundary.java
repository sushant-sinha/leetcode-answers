class Solution {
    public int returnToBoundaryCount(int[] nums) {
        
        int ans=0, sum=nums[0];
        
        for(int i=1;i<nums.length;i++){
            
            sum+=nums[i];
            
            if(sum==0)
                ans++;
        }
        
        return ans;
        
    }
}