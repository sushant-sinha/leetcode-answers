// SUSHANT SINHA

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        
        if(amount < 1) return 0;
        
        for(int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            boolean found = false;
            for(int coin: coins) {
                if(i >= coin && dp[i-coin] != -1) {
                    min = Math.min(min, dp[i-coin] +1);
                    found = true;
                }
            }
            
            dp[i] = found ? min : -1;
        }
        
        return dp[amount];
    }
}