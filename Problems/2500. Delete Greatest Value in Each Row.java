// SUSHANT SINHA

// 3ms ( 99.81% ) 42mb ( 98.26% )

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        
        int sum=0;
        
        // rowwise sorted values in matrix
        
        int m=grid.length, n=grid[0].length;
        
        for(int i=0;i<m;i++){
            
            Arrays.sort(grid[i]);
            
        }
        
        for(int j=n-1;j>=0;j--){
            
            int max=0;
            
            for(int i=0;i<m;i++){
                max=max<grid[i][j] ? grid[i][j] : max;
            }
            
            sum+=max;
            
        }
        
        return sum;
        
    }
}