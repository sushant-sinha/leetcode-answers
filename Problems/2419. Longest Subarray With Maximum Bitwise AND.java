class Solution {
    public int longestSubarray(int[] nums) {
        
        int ans=0;
        
        int max=0;
        
        for(int i:nums)
            if(max<i)
                max=i;
        
        int templen=0;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==max){
                while(i<nums.length && nums[i]==max){
                    templen++;
                    i++;
                }
            }
            
            ans= templen>ans ? templen : ans;
            templen=0;
            
        }
        
        return ans;
        
    }
}