// SUSHANT SINHA

// 50ms ( 86.44% ) 54.8mb ( 74.78% )

class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
        
        int ans=0;
        
        for(int i=0;i<nums.length/2;i++)
            ans = ans<nums[i]+nums[nums.length-1-i] ? nums[i]+nums[nums.length-1-i] : ans;
        
        return ans;
        
    }
}