// SUSHANT SINHA

// 11ms ( 31.52% ) 40.8mb ( 75.12% )

class Solution {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int ans=0;
        
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
                ans+=nums[i];
        }
        
        return ans;
        
    }
}