// SUSHANT SINHA

// 3ms ( 100% ) 38.8mb ( 100% )

class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        if(k==1)
            return 0;
        
        Arrays.sort(nums);
        
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<=nums.length-k;i++){
            
            ans = ans<(nums[i+k-1]-nums[i]) ? ans : nums[i+k-1]-nums[i];
            
        }
        
        return ans;
        
    }
}