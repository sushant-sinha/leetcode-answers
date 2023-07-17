// SUSHANT SINHA

// 1ms ( 100% ) 43.5mb ( 25% )

class Solution {
    public int sumOfSquares(int[] nums) {
        
        int ans=0, n=nums.length;
        
        for(int i=0;i<n;i++){
            if(n%(i+1)==0)
                ans+=(nums[i]*nums[i]);
        }
        
        return ans;
        
    }
}