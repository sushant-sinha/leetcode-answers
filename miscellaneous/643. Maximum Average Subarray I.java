// SUSHANT SINHA

// slower solution

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        double sum = 0;
        // init the sum of k items
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        // calculate
        double max = sum;
        for (int i = k; i < nums.length; i++) {
            max = Math.max(sum, max);
            sum = sum - nums[i - k] + nums[i];
        }
        max = Math.max(sum, max);
        return max / k;
    }
}

// faster solution

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        long maxSum = sum;
        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i-k];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return 1.0 * maxSum / k;
    }
}