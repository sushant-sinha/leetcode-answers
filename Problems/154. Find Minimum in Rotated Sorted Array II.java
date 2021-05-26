// SUSHANT SINHA

// same algo as that of 153
// 0ms ( 100% ) 38.1 mb ( 80.43% )

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