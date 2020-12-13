// SUSHANT SINHA

class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int len = n + 2;
        int[] a = new int[len];
        System.arraycopy(nums, 0, a, 1, n);
        a[0] = 1;
        a[len - 1] = 1;
        
        int[][] dp = new int[len][len];
        
        for (int gap = 2; gap < len; gap++) {
            for (int left = 0; left < len - gap; left++) {
                int right = left + gap;
                int cur = 0;
                for (int i = left + 1; i < right; i++) {
                    cur = Math.max(cur, dp[left][i] + dp[i][right] + a[i] * a[left] * a[right]);        // test point : i is middle point. left, i , right.
                }
                
                dp[left][right] = cur;
            }
        }
        
        return dp[0][len - 1];
    }
}