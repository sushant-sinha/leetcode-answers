// try
// SUSHANT SINHA

class Solution {
    public int maxDotProduct(int[] A, int[] B) {
        int m = A.length+1;
        int n = B.length+1;
        int dp[][] = new int[m][n];

        int ans = Integer.MIN_VALUE;
        for (int i : A) {
            for (int j : B) 
                ans = Math.max(ans,i*j);
        }
        if (ans < 0) return ans; 
        /*
        because if the maximum value is negative, all other combination swill have lesser value than this 'ans', adding other negative values leads decrease in value. 
        example:
        ans=-9, means it has maximum value.
        another combination has -11, then dot product will be -11-9=-20
        */
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                else {
                    int a = (dp[i-1][j-1]+(A[i-1]*B[j-1]));
                    int b = Math.max(dp[i-1][j],dp[i][j-1]);
                    dp[i][j] = Math.max(a,b);

                }
            }
        }
        return dp[m-1][n-1];
    }
}