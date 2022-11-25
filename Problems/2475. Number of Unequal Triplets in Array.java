class Solution {
    public int unequalTriplets(int[] nums) {
        
        int ans=0;
        
        for(int i=0;i<nums.length-2;i++){
            
            for(int j=i+1;j<nums.length-1;j++){
                
                if(nums[j]==nums[i])
                    continue;
                
                for(int k=j+1;k<nums.length;k++){
                    
                    if(nums[k]==nums[j])
                        continue;
                    
                    if(nums[i]==nums[k])
                        continue;
                    
                    ans++;
                    
                }
                
            }
            
        }
        
        return ans;
        
    }
}