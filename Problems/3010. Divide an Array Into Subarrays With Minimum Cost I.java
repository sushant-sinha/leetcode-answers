// SUSHANT SINHA

// 2ms ( 49.63% ) 44.49mb ( 18.68% )

class Solution {
    public int minimumCost(int[] nums) {
        
        int ans=nums[0];
        
        // sorting to prevent myself from writing a for loop
        Arrays.sort(nums);
        
        if(nums[0]!=ans && nums[1]!=ans && nums[2]!=ans){
            ans+=nums[0]+nums[1];
        }
        
        else{
            ans+=nums[0]+nums[1]+nums[2]-ans;
        }
        
        return ans;
        
    }
}