class Solution {
    public int findNonMinOrMax(int[] nums) {
        
        if(nums.length==2)
            return -1;
        
        Arrays.sort(nums);
        
        for(int i=1; i<nums.length-1; i++){
            if(nums[i]!=nums[0] || nums[i]!=nums[nums.length-1])
                return nums[i];
        }
        
        
        return -1;
        
    }
}