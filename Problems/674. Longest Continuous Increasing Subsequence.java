class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int ans=1, temp=1;
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]>nums[i-1]){
                temp++;
                ans= temp>ans ? temp : ans;
            }
            
            else
                temp=1;
            
        }
        
        return ans;
        
    }
}