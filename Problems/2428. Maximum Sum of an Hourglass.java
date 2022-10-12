// SUSHANT SINHA

// 8ms ( 55.03% ) 54.4mb ( 26.56% )

class Solution {
    public int maxSum(int[][] grid) {
        
        int sum=-1;
        
        for(int i=0;i<=grid.length-3;i++){
            
            for(int j=0;j<=grid[0].length-3;j++){
                int temp=grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                
                sum=sum>temp ? sum : temp;
            }
            
        }
        
        return sum;
        
    }
}