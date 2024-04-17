// https://leetcode.com/problems/maximum-sum-circular-subarray/solutions/2868539/maximum-sum-circular-subarray/?orderBy=hot

// couldn't solve this question

// visit the other part of this question also
// use kadane's algo
// solve this: https://leetcode.com/problems/maximum-subarray/ question as well

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curMax = 0, curMin = 0, sum = 0, maxSum = nums[0], minSum = nums[0];
        for (int num : nums) {
            curMax = Math.max(curMax, 0) + num;
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin, 0) + num;
            minSum = Math.min(minSum, curMin);
            sum += num;  
        }
        return sum == minSum ? maxSum : Math.max(maxSum, sum - minSum);
    }
}