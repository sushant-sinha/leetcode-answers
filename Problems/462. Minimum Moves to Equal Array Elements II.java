// SUSHANT SINHA

// ~~ symbol is a faster way of flooring a positive number
// 2ms ( 98.21% ) 39.5mb ( 71.75% )

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans = 0, median = nums[~~(nums.length / 2)];
        for (int num : nums) ans += Math.abs(median - num);
        return ans;
    }
}