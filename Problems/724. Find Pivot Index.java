// SUSHANT SINHA

class Solution {
    public int pivotIndex(int[] nums) {
        
        int ans=-1,lsum=0,sum=0;
        
        for(int s:nums)
            sum+=s;
        
        for(int i=0;i<nums.length;i++){
            
            sum-=nums[i];
            
            if(lsum==sum){
                ans=i;
                break;
            }
            
            lsum+=nums[i];
            
        }
        
        return ans;
        
    }
}