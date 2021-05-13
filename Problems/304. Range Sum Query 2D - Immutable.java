// SUSHANT SINHA
// https://leetcode.com/problems/range-sum-query-2d-immutable/discuss/1205058/java-solution-based-on-range-sum-query-303-question

// 11ms ( 64.75% ) 44.5mb ( 81.45% )

class NumMatrix {
    
    int sumcol[][];

    public NumMatrix(int[][] matrix) {
        
        int row=matrix.length;
        int col=matrix[0].length;
                
        sumcol=new int[row][col];
        
        for(int i=0;i<matrix[0].length;i++)
            sumcol[0][i]=matrix[0][i];
        
        for(int i=0;i<col;i++){
            
            for(int j=1;j<row;j++){
                
                sumcol[j][i]=sumcol[j-1][i]+matrix[j][i];
                
            }
            
        }
        
        
        
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        int ans=0;
        
        if(row1==0){
            
            for(;col1<=col2;col1++){
                //System.out.println(sumcol[row2][col1]);
                ans+=sumcol[row2][col1];
            }
            
        }
        
        else{
            
            for(;col1<=col2;col1++){
                //System.out.println(sumcol[row2][col1]-sumcol[row1-1][col1]);
                ans+=sumcol[row2][col1]-sumcol[row1-1][col1];
            }
            
        }
        
        return ans;
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */