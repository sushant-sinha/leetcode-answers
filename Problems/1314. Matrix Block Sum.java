// SUSHANT SINHA

// my solution....... brute force 🤣🤣
// 133ms ( 14.93% ) 40.3mb ( 30.93% )

class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        
        int ans[][]=new int[mat.length][mat[0].length];
        
        for(int i=0;i<mat.length;i++){
            
            for(int j=0;j<mat[0].length;j++){
                
                int r[]=new int[2];
                int c[]=new int[2];
                
                r[0] = Math.max(0,(i-k));
                r[1] = (i+k)>=mat.length ? mat.length-1 : (i+k);
                
                c[0] = Math.max(0,j-k);
                c[1] = (j+k)>=mat[0].length ? mat[0].length-1 : (j+k);
                
                
                
                int sum=0;
                
                for(int x=r[0];x<=r[1];x++){
                    for(int y=c[0];y<=c[1];y++){
                     
                        sum+=mat[x][y];
                        
                    }
                    
                }
                
                ans[i][j]=sum;
                
                
            }
            
        }
        
        return ans;
        
    }
}


// best solution
// 1ms ( 100% ) 40.7mb ( 10.25% )

class Solution {
    int rows;
    int cols;
    public int[][] matrixBlockSum(int[][] mat, int K) {
        rows = mat.length;
        cols = mat[0].length;
        
        int[][] summed = new int[rows][cols];
        
        dp(0, 0, summed, mat);
        
        int[][] res = new int[rows][cols];
        
        for(int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                solve(res, r, c, K, summed);
            }
        }
        
        return res;
    }
    
    int access(int r, int c, int[][] arr) {
        if (r < 0 || r >= rows || c < 0 || c >= cols) {
            return 0;
        }
        
        return arr[r][c];
    }
    
    void solve(int[][] res, int r, int c, int K, int[][] s) {
        int r1 = r - K;
        int c1 = c - K;
        
        int r2 = r + K;
        int c2 = c + K;
        
        r1 = Math.max(r1, 0);
        c1 = Math.max(c1, 0);
        
        r2 = Math.min(r2, rows - 1);
        c2 = Math.min(c2, cols - 1);
        
        res[r][c] = s[r1][c1] - access(r1, c2 + 1, s) - access(r2 + 1, c1, s) + access(r2 + 1, c2 + 1, s);
        
    }
    
    int dp(int r, int c, int[][] s, int[][] m) {
        if (r >= rows || c >= cols) {
            return 0;
        }
        
        if (s[r][c] != 0) {
            return s[r][c];
        }
        
        s[r][c] = m[r][c] + dp(r, c + 1, s, m) + dp(r + 1, c, s, m) - dp(r + 1, c + 1, s, m);
        
        return s[r][c];
    }
}