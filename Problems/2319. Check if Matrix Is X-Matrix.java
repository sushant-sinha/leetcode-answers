// SUSHANT SINHA

// 4ms ( 19.20% ) 54.2mb ( 61.76% )

class Solution {
    public boolean checkXMatrix(int[][] grid) {
        
        for(int i=0;i<grid.length;i++){
            
            for(int j=0;j<grid.length;j++){
                
                if(i==j && grid[i][j]==0)
                    return false;
                
                else if(i+j==grid.length-1 && grid[i][j]==0)
                    return false;
                
                else if(i!=j && i+j!=grid.length-1 && grid[i][j]!=0)
                    return false;
            }
            
        }
        
        return true;
        
    }
}