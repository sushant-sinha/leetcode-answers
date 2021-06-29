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

// by just replacing nums.length with a variale (n)
// 49ms ( 97.36% ) 54.7mb ( 85.08% )

class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
        
        int ans=0,n=nums.length;
        
        for(int i=0;i<nums.length/2;i++)
            ans = ans<nums[i]+nums[n-1-i] ? nums[i]+nums[n-1-i] : ans;
        
        return ans;
        
    }
}