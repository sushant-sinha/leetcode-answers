// SUSHANT SINHA

// my solution .... slow

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int b:nums){
                if(b<nums[i])ans[i]++;
            }
        }
        
        return ans;
        
    }
}
