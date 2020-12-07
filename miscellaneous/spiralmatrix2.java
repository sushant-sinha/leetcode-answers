// SUSHANT SINHA

// My solution


class Solution {
    public int[][] generateMatrix(int n) {
        
        int ans[][]=new int[n][n];
        
        if(n==1){ans[0][0]=1;return ans;}
        int i=0,x=1;
       while(x<=n/2){
        for(int j=x;j<=n-x+1;j++)ans[x-1][(j-1)]=++i;
        for(int j=x;j<n-x+1;j++)ans[j][(n-x)]=++i;
        for(int j=x;j<n-x+1;j++)ans[(n-x)][(n-j-1)]=++i;
        for(int j=x;j<(n-x);j++)ans[(n-j-1)][x-1]=++i;
        ++x;
        }
        if(n%2!=0)ans[n/2][n/2]=++i;
        return ans;
    }
}



// Fastest Solution

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;
        
        int i = 1;
        while (i <= n * n) {
            
            for (int j = colStart; j <= colEnd; j++) {
                res[rowStart][j] = i;
                i++;
            }  
            //print(res);
            for (int j = rowStart + 1; j <= rowEnd; j++) {
                res[j][colEnd] = i;
                i++;
            }
            //print(res);
            if (colStart < colEnd) {
                for (int j = colEnd - 1; j >= colStart; j--) {
                    res[rowEnd][j] = i;
                    i++;
                }
            }
            //print(res);    
            if (rowStart < rowEnd) {
                for (int j = rowEnd - 1; j > rowStart; j--) {
                    res[j][colStart] = i;
                    i++;
                }
            }
            //print(res);
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
        
        return res;
    }
    
    private void print(int[][] r) {
        for (int[] s: r) {
            System.out.println(Arrays.toString(s));
        }
    }
}