class Solution {
    public int minimumCost(int[] nums) {
        
        int ans=nums[0];
        
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