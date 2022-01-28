// SUSHANT SINHA

// 5ms ( 17.92% ) 39.1mb ( 65.37%% )

class Solution {
    public int countElements(int[] nums) {
        
        Arrays.sort(nums);
        
        int ans=0;
        boolean small=false, large=false;
        
        for(int i=1; i<nums.length-1;i++){
            
            //int cur=nums[i];
            
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i])
                    small=true;
            }
            
            for(int j=nums.length-1;j>i;j--){
                if(nums[j]>nums[i])
                    large=true;
            }
            
            if(large && small)
                ans++;
            
            large=false;
            small=false;
            
            
        }
        
        return ans;
        
    }
}
