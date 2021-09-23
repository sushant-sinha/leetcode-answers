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