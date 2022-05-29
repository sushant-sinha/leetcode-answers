// SUSHANT SINHA

// 0ms-1ms ( 100%-65.97% ) 50.5mb-49.5mb ( 68.83%-71.25% )

class Solution {
    public int missingNumber(int[] nums) {
        
        // USING BIT MANIPULATION FASTEST
        // from the submission tab
                
        
        int ans = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            ans ^= i;
            ans ^= nums[i];
        }
        
        return ans;
        
        /* USING SUM FASTEST
        
        
        int ans=0;
        for(int i=0;i<nums.length;i++)ans+=nums[i];
        return ((nums.length)*(nums.length+1)/2)-ans;
        
        */
        
        /* SORTING
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
        if(nums[i]!=i)return i;
        }
        return nums.length;
        
        */
        
    }
}