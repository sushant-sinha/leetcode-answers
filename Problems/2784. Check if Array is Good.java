class Solution {
    public boolean isGood(int[] nums) {
        
        Arrays.sort(nums);
        
        if(nums.length==1)
            return false;
        
        if(nums.length==2){
            if(nums[0]==1 && nums[1]==1)
                return true;
            else
                return false;
        }
        
        if(nums[0]!=1)
            return false;
        
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]-nums[i-1]!=1)
                return false;
        }
        
        if(nums[nums.length-1]==nums.length-1 && nums[nums.length-1]==nums[nums.length-2])
            return true;
        
        else
            return false;
        
    }
}