// SUSHANT SINHA

// 1ms ( 98.19% ) 38.8mb ( 33.83% )

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int max1[]=new int[grid[0].length];
        int max2[]=new int[grid.length];
        
        for(int i=0;i<grid.length;i++){
            
            for(int j=0;j<grid[0].length;j++){
                
                max2[i] = max2[i] > grid[i][j] ? max2[i] : grid[i][j];
                
            }
            
        }
        
        for(int i=0;i<grid[0].length;i++){
            
            for(int j=0;j<grid.length;j++){
                
                max1[i] = max1[i] > grid[j][i] ? max1[i] : grid[j][i];
                
            }
            
        }
        
        int ans=0;
                
        for(int i=0;i<grid.length;i++){
            
            for(int j=0;j<grid[0].length;j++){
                
                int min= max2[i]<max1[j] ? max2[i] : max1[j];
                
                ans+=min-grid[i][j];
                
            }
            
        }
        
        return ans;
        
        
        
    }
}