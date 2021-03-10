// SUSHANT SINHA

// from https://github.com/varunu28/LeetCode-Java-Solutions/blob/master/Medium/Diagonal%20Traverse.java

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{};
        }
        
        int dir = 0;
        int x = 0;
        int y = 0;
        int numOfRows = matrix.length;
        int numOfCols = matrix[0].length;
        int[] ans = new int[matrix.length * matrix[0].length];
        
        for (int i = 0; i < numOfRows * numOfCols; i++) {
            ans[i] = matrix[x][y];
            
            if ((x + y) % 2 == 0) {
                // If last column then go to next row
                if (y == numOfCols - 1) {
                    x++;
                }
                // If first row but not last column then go to next column
                else if (x == 0) {
                    y++;
                }
                // Go up
                else {
                    x--;
                    y++;
                }
            }
            else {
                // If last row then go to next column
                if (x == numOfRows - 1) {
                    y++;
                }
                // If first column but not last row then go to next row
                else if (y == 0) {
                    x++;
                }
                // Go down
                else {
                    x++;
                    y--;
                }
            }
        }
        
        return ans;
    }
}







// My solution works when m=n i.e square matrix is given

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{};
        }
        int ans[]=new int[(matrix.length*matrix.length)];
        
         ans[0]=matrix[0][0];
         ans[ans.length-1]=matrix[matrix.length-1][matrix.length-1];
        
        int ari=0,index=1;
        
        while(index <2*matrix.length){
        
            if(index%2!=0){
            
        for(int i=0;i<(matrix.length);i++){
            
            for(int j=0;j<matrix.length;j++){
                if((i+j)==index)ans[++ari]=matrix[i][j];
            }
            
        }
            }
            else{
                for(int i=0;i<(matrix.length);i++){
            
            for(int j=0;j<matrix.length;j++){
                if((i+j)==index)ans[++ari]=matrix[j][i];
            }
            
        }
            }
            index++;
        }
        
        //System.out.println(ans.length);
        
        return ans;
    }
}