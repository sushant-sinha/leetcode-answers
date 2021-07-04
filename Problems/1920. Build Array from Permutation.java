// SUSHANT SINHA

// 1ms 39.5mb (not enough accepted submission to show distribution)

class Solution {
    public int[] buildArray(int[] nums) {
        
        int ans[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
            ans[i]=nums[nums[i]];
        
        return ans;
        
    }
}