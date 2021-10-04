// SUSHANT SINHA

// 3ms ( 100% ) 49.2mb ( 25% )

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        if(original.length!=m*n)
            return new int[0][0];
        
        int ans[][]=new int[m][n];
        
        int index=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                ans[i][j]=original[index++];
        }
        
        return ans;
        
    }
}