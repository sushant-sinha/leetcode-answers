// SUSHANT SINHA

// 0ms ( 100% ) 38.8mb ( 95.92% )

class Solution {
    public int[] runningSum(int[] nums) {
        
        for(int i=1;i<nums.length;i++)
            nums[i]+=nums[i-1];
        
        return nums;
        
    }
}