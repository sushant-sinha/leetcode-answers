// SUSHANT SINHA

// brute force solution (input size too small)
// check 2874. Maximum Value of an Ordered Triplet II for optimised solution

// 3ms ( 66.47% ) 40.7mb ( 54.8% )

class Solution {
    public long maximumTripletValue(int[] nums) {
        
        long ans=0;
        
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++)
                    ans= ans>(long)(nums[i]-nums[j])*nums[k] ? ans : (long)(nums[i]-nums[j])*nums[k];
            }
        }
        
        return ans;
        
    }
}