// SUSHANT SINHA

// 0ms ( 100% ) 37.9mb ( 99.11% )
// followup part is important

class Solution {
    public int search(int[] nums, int target) {
                
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
        }
        
        return -1;
        
    }
}