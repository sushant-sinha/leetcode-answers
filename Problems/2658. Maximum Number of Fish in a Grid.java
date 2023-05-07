// SUSHANT SINHA

// looks like finding biggest island question or biggest connected component
// 5ms ( 99.14% ) 42.6mb ( 82.69% )

class Solution {
    
    int grid1[][];
    int row, col, temp;
    
    public int findMaxFish(int[][] grid) {
        
        grid1=grid;
        
        int ans=0;
        row=grid1.length;
        col=grid1[0].length;
        
        // System.out.println(row+" "+col);
        
        for(int i=0;i<row;i++){
            
            for(int j=0;j<col;j++){
                if(grid1[i][j]>0){
                    temp=0;
                    helper(i, j);
                    // System.out.println("i="+i+" j="+j+" cur ans="+ans+" temp="+temp);
                    ans = ans>temp ? ans : temp;
                }
            }
            
        }
        
        return ans;
        
    }
    
    void helper(int i, int j){
        
        if(i<0 || j<0 || i>=row || j>=col || grid1[i][j]<1)
            return;
        
        temp+=grid1[i][j];
        
        grid1[i][j]=-1;
        
        helper(i+1, j);
        helper(i-1, j);
        helper(i, j+1);
        helper(i, j-1);
        
    }
}