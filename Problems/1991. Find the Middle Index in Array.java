// SUSHANT SINHA

// 0ms ( 100% ) 38.2mb ( 100% )

class Solution {
    public int findMiddleIndex(int[] nums) {
        
        if(nums.length==1)
            return 0;
        
        int lsum=0,rsum=0;
        
        for(int i:nums){
            rsum+=i;
        }
        
        rsum-=nums[0];
        
        if(rsum==0)
            return 0;
        
        for(int i=1;i<nums.length;i++){
            
            lsum+=nums[i-1];
            rsum-=nums[i];
            
            if(lsum==rsum)
                return i;
        }
        
        return -1;
        
    }
}