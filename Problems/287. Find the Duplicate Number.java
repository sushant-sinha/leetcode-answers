// SUSHANT SINHA

// 31ms ( 30.65% ) 60.4mb ( 82.18% )

class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++)
            if(nums[i]==nums[i+1])
                return nums[i];
        
        return 0;
        
    }
}