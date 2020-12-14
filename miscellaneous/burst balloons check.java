// SUSHANT SINHA

class Solution {
public int maxCoins(int[] nums) {
    if(nums.length==0)return 0;
        int T[][] = new int[nums.length][nums.length];

        for (int len = 1; len <= nums.length; len++) {
            for (int i = 0; i <= nums.length - len; i++) {
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    //leftValue/rightValue is initially 1. If there is element on
                    // left/right of k then left/right value will take that value.
                    int leftValue = 1;
                    int rightValue = 1;
                    if (i != 0) {
                        leftValue = nums[i-1];
                    }
                    if (j != nums.length -1) {
                        rightValue = nums[j+1];
                    }

                    //before is initially 0. If k is i then before will
                    //stay 0 otherwise it gets value T[i][k-1]
                    //after is similarly 0 initially. if k is j then after will
                    //stay 0 other will get value T[k+1][j]
                    int before = 0;
                    int after = 0;
                    if (i != k) {
                        before = T[i][k-1];
                    }
                    if (j != k) {
                        after = T[k+1][j];
                    }
                    T[i][j] = Math.max(leftValue * nums[k] * rightValue + before + after,
                            T[i][j]);
                }
            }
        }
        return T[0][nums.length - 1];
    }
}

// fastest solution

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