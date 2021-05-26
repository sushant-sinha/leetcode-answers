// SUSHANT SINHA

class Solution {
    public int findMin(int[] nums) {
        
        if(nums.length==1)
            return nums[0];
        
        int i=nums.length-1;
        
        for(;i>=1;i--){
            if(nums[i]<nums[i-1]){
                return nums[i];
            }
        }
        
        return nums[0];
        
    }
}