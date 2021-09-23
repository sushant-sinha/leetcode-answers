// SUSHANT SINHA

// 0ms ( 100% ) 38.6mb ( 80.89% )
// faster solution

class Solution {
    public int countKDifference(int[] nums, int k) {
        
        int counter[]=new int[101];
        
        int ans=0;
        
        for(int i:nums)
            counter[i-1]++;
        
        for(int i=0;i<100-k;i++){
            ans+= counter[i]*counter[i+k];
        }
        
        return ans;
        
    }
}

// 6ms ( 78.73% ) 38.5mb ( 86.13% )
// basic approach

class Solution {
    public int countKDifference(int[] nums, int k) {
        
        int ans=0;
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++)
                ans+= Math.abs(nums[i]-nums[j])==k ? 1 : 0;
        }
        
        return ans;
        
    }
}