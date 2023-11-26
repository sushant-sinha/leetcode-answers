// SUSHANT SINHA

// 2ms ( 99.07% ) 43.06mb ( 56.53% )

class Solution {
    public int maximumStrongPairXor(int[] nums) {
        
        int ans=0;
        
        for(int i=0;i<nums.length;i++){
            
            for(int j=i;j<nums.length;j++){
                
                if(Math.abs(nums[i]-nums[j]) <= Math.min(nums[i], nums[j])){
                    ans = Math.max(ans, nums[i]^nums[j]);
                }
                
            }
            
        }
        
        return ans;
        
    }
}