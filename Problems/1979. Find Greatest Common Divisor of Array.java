class Solution {
    public int findGCD(int[] nums) {
        
        Arrays.sort(nums);
        
        int ans=1;
        
        if(nums[0]==nums[nums.length-1] || nums[nums.length-1]%nums[0]==0)
            return nums[0];
        
        for(int i=1;i<=nums[0]/2;i++){
            
            if(nums[0]%i==0 && nums[nums.length-1]%i==0)
                ans=i;
            
        }
        
        return ans;
        
    }
}