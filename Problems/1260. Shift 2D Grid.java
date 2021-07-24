// SUSHANT SINHA

// 7ms ( 55.95% ) 39.9mb ( 58.63% )

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        while(k!=0){
            k--;
            
            int temp=grid[0][0];
            
            for(int i=0;i<grid.length;i++){
                
                int l=grid[i][grid[0].length-1];
                
                for(int j=0;j<grid[0].length;j++){
                    
                    int x=grid[i][j];
                    grid[i][j]=temp;
                    temp=x;                    
                    
                }
                
            }
            
            grid[0][0]=temp;
        }
        
        List<List<Integer>> ans= new ArrayList<>();
        
        for(int a[]:grid){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int b:a){
                temp.add(b);
            }
            ans.add(temp);
        }
        
        return ans;
        
    }
}

// best solution from the submission details tab ( with comments explaining the steps)

// 1ms ( 100% ) 39.4mb ( 96.43% )

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rowCount = grid.length;                         // Number of rows in grid.
        int colCount = grid[0].length;                      // Number of columns in grid.
        int gridCount = rowCount * colCount;                // Number of cells (i.e. values) in grid.
        k = k % gridCount;                                  // Limit k to max number of cells in grid.  Avoid negatives in next lines.
        int kCol = (gridCount - k) % colCount;              // Column to start copying from.
        int kRow = ((gridCount - k) % gridCount) / colCount;// Row to start copying from.
        int[] innRow = grid[kRow];                          // Array for the row to start copying from.
        int[][] result = new int[rowCount][colCount];       // Create result matrix, to hold shifted values.
        for (int r = 0; r < rowCount; r++) {                // Loop through "to" rows.
            int[] outRow = result[r];                       // Get row array to copy into, so only faster 1D reference in inner loop.
            for (int c = 0; c < colCount; c++) {            // Loop through "to" columns.
                outRow[c] = innRow[kCol];                   // Copy value from grid to result, shifting by copying.
                if (++kCol >= colCount) {                   // Next "from" column.  If at end of row...
                    kCol = 0;                               // Then start "from" columns at first column.
                    if (++kRow >= rowCount)                 // When starting new column, next "from" row.  If at end of grid...
                        kRow = 0;                           // Then start "from" rows at first row.
                    innRow = grid[kRow];                    // Get row array to copy from, so only faster 1D reference when copying.
                }
            }
        }
        return (List)Arrays.asList(result);                 // Return result matrix, converting it to a List<List<Integer>>.
    }
}