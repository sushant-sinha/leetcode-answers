// SUSHANT SINHA

// 6ms ( 79.06% ) 39.4mb ( 43.44% ) 
// no brain needed

class Solution {
    public int maxProductDifference(int[] nums) {
        
        Arrays.sort(nums);
        
        return ((nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]));
        
    }
}

