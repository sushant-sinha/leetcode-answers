class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int ans=0;
        
        for(int i=0;i<grid.length;i++){
            
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j]==1){
                    ans=Math.max(ans, helper(grid, i, j));
                }
                
            }
            
        }
        
        return ans;
    }
    
    int helper(int grid[][], int r, int c){
        
        if(r<0 || r>=grid.length || c>=grid[0].length || c<0)
            return 0;
        
        if(grid[r][c]==0)
            return 0;
        
        grid[r][c]=0;
        
        return 1+helper(grid, r+1, c)+helper(grid, r, c+1)+helper(grid, r-1, c)+helper(grid, r, c-1);
        
    }
}