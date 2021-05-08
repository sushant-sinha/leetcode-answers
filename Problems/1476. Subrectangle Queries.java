// SUSHANT SINHA

class SubrectangleQueries {

    int ar[][];
    
    public SubrectangleQueries(int[][] rectangle) {
        
        ar = new int[rectangle.length][rectangle[0].length];
        
        for(int i=0;i<rectangle.length;i++){
            for(int j=0;j<rectangle[0].length;j++){
                ar[i][j]=rectangle[i][j];
            }
        }
        
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        
        for(;row1<=row2;row1++){
            for(int i=col1;i<=col2;i++){
                ar[row1][i]=newValue;
            }
        }
        
    }
    
    public int getValue(int row, int col) {
        
        return ar[row][col];
        
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */