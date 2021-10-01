// SUSHANT SINHA

// 0ms ( 100% ) 38.5mb ( 79.01% )

class Solution {
    public int maximumDifference(int[] nums) {
        
        int ans=-1, min = nums[0];
        
        for (int i=1;i<nums.length;i++){
            
            if (nums[i]>min){
                if(nums[i]-min>ans)
                    ans=nums[i]-min;
            }
            
            else
                min=nums[i];
            
        }
        
        return ans;
    }
}