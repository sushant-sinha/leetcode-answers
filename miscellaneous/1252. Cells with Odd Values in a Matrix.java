// SUSHANT SINHA

// 1ms ( 74.53% ) 37mb ( 63.27% )

class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        
        int mat[][]=new int[n][m];
        
        for(int i=0;i<indices.length;i++){
            
            int row=indices[i][0];
            int column=indices[i][1];
            
            for(int j=0;j<m;j++)
                mat[row][j]++;
            
            for(int j=0;j<n;j++)
                mat[j][column]++;
            
        }
        
        int ans=0;
        
        for(int x[]:mat)
            for(int y:x)
                if(y%2!=0)
                    ans++;
        
        return ans;
        
    }
}