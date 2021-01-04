// SUSHANT SINHA

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

