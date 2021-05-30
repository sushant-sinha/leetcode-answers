// SUSHANT SINHA

// correct answer but wrong implementation

class Solution {
    public int maximumGap(int[] nums) {
        
        if(nums.length==1)
            return 0;
        
        Arrays.sort(nums);
        
        int max=0;
        
        for(int i=0;i<nums.length-1;i++){
            
            max = max> Math.abs(nums[i]-nums[i+1]) ? max : Math.abs(nums[i]-nums[i+1]);
        }
        
        return max;
        
        
    }
}
