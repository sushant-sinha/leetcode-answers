// SUSHANT SINHA

// 3ms ( 75% ) 51.9mb ( 50% )

class Solution {
    public int[][] largestLocal(int[][] grid) {
        
        int ans[][]=new int[grid.length-2][grid.length-2];
        
        int row=0, col=0;
        
        for(int i=1;i<grid.length-1;i++){
            
            for(int j=1;j<grid.length-1;j++){
                
                //System.out.println(i+" "+j+" row="+row+" col="+col);
                
                ans[row][col]=findMax(grid, i, j);
                col++;
                
            }
            
            row++; col=0;
            
        }
        
        return ans;
        
    }
    
    int findMax( int grid[][], int i, int j ){
        
        int max=0;
        
        // System.out.println("--------------");
        
        for(int x=i-1; x<=i+1; x++){
            
            for(int y=j-1; y<=j+1; y++){
                //System.out.println(x+" "+y+" val="+grid[i][j]);
                max = max > grid[x][y] ? max : grid[x][y];
            }
            
        }
        
        return max;
        
    }
    
}


// best solution
// 2ms

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        
        int [][] result = new int [n - 2][n - 2];
        int max;
        
        for (int i = 0; i < n - 2; ++i){
            for (int j = 0; j < n - 2; ++j){
                max = 1;
                for (int a = 0; a < 3; ++a){
                    for (int b = 0; b < 3; ++b){
                        max = Math.max(max, grid[i + a][j + b]);
                    }
                }
                
                result[i][j] = max;
            }
        }
        
        return result;
    }
}