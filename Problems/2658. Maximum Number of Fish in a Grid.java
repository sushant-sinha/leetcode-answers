// SUSHANT SINHA

// looks like finding biggest island question or biggest connected component
// 5ms ( 99.14% ) 42.6mb ( 82.69% ) - space complexity when using grid1 global copy

/*

    In previous commit I was using a copy of grid to fix the possible issue caused by the difference in pass by value or pass by reference confusion
    
    I thought in line #31 passing grid will be pass by value and thus the changes made in line #49 will have its own copy and wont be reflected in
    the original which is being trversed in the main function (line #29 )

*/

class Solution {

    int row, col, temp;
    
    public int findMaxFish(int[][] grid) {
        
        int ans=0;
        row=grid.length;
        col=grid[0].length;
        
        for(int i=0;i<row;i++){
            
            for(int j=0;j<col;j++){

                if(grid[i][j]>0){
                    temp=0;
                    helper(grid, i, j);
                    ans = ans>temp ? ans : temp;
                }
            }
            
        }
        
        return ans;
        
    }
    
    void helper(int[][] grid1, int i, int j){
        
        if(i<0 || j<0 || i>=row || j>=col || grid1[i][j]<1)
            return;
        
        temp+=grid1[i][j];
        
        grid1[i][j]=-1;
        
        helper(grid1, i+1, j);
        helper(grid1, i-1, j);
        helper(grid1, i, j+1);
        helper(grid1, i, j-1);
        
    }
}