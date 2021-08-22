// SUSHANT SINHA

// used hint and discuss tab
// 4ms ( 100% ) 47.9mb ( 100% )

class Solution {
    public long maxMatrixSum(int[][] matrix) {
        
        long ans = 0, count = 0, min = Integer.MAX_VALUE;
        
        for(int i=0;i<matrix.length;i++)
            
            for(int j=0;j<matrix[0].length;j++) {
                
                if(matrix[i][j] < 0) {
                    count++;
                    matrix[i][j] *= -1;
                }
                
                min = min>matrix[i][j] ? matrix[i][j] : min;
                ans += matrix[i][j];
                
            }
        
        return count%2!=0 ? ans-min*2 : ans;
        
    }
}