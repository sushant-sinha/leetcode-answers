// SUSHANT SINHA

// below given link is for the approach in which the islands which are sharing the edge with the boundary of the 
// https://leetcode.com/problems/number-of-closed-islands/discuss/761788/clean-C%2B%2B-solution-using-DFS

// 3ms ( 60.74% ) 45.9mb ( 81.34% )

class Solution {
    
    public int closedIsland(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        
        int ans=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j]==0)
                    ans+=dfs(grid, i, j, m, n) ? 1 : 0;
                
            }
        }
        
        return ans;
        
    }
    
    boolean dfs(int[][] grid, int i, int j, int m, int n){
        
        if(i>=m || i<0 || j>=n || j<0)
            return false;
        
        if(grid[i][j]==1 || grid[i][j]==2){
            
            return true;
        }
        
        grid[i][j]=2;
        
        boolean left=dfs(grid, i, j-1, m , n);
        boolean right=dfs(grid, i, j+1, m , n);
        boolean top=dfs(grid, i-1, j, m , n);
        boolean bottom=dfs(grid, i+1, j, m , n);
        
        return left && right && top && bottom;
        
    }
    
}