// SUSHANT SINHA

// 13ms ( 59.99% ) 44mb ( 33.75% )

// instead of using Arrays.sort do this 👇🏻
// iterate through the entire nums
// in one pass we can find the min and max
// in the same pass itself, we can maintain another variable which has the value smaller than max (aka largest value smaller than max) or larger than min (aka smallest value larger than min)

class Solution {
    public int findNonMinOrMax(int[] nums) {
        
        if(nums.length<=2)
            return -1;
        
        Arrays.sort(nums);
        
        return nums[1];
        
    }
}