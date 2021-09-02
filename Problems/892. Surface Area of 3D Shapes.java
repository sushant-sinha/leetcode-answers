// SUSHANT SINHA

// 2ms ( 95.76% ) 38.7mb ( 60.17% )

class Solution {
    public int surfaceArea(int[][] grid) {
        
        int ans=0;
        
        for(int i=0;i<grid.length;i++){
            
            for(int j=0;j<grid.length;j++){
                
                // top
                
                if(grid[i][j]!=0)
                    ans+=2;
                
                // up
                
                if((i-1)<0){
                    ans+=grid[i][j];
                }
                
                else{
                    ans+=Math.abs(grid[i][j]-grid[i-1][j]);
                }
                
                // left
                
                if((j-1)<0){
                    ans+=grid[i][j];
                }
                
                else{
                    ans+=Math.abs(grid[i][j-1]-grid[i][j]);
                }
                
                // right
                
                if((j+1)==grid.length)
                    ans+=grid[i][j];
                
                // down
                
                if((i+1)==grid.length)
                    ans+=grid[i][j];
                
            }
            
        }
        
        return ans;
        
    }
}