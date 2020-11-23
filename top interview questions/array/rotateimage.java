// SUSHANT SINHA
class Solution {
    public void rotate(int[][] matrix) {
        int ans[][]=new int[matrix.length][matrix.length];
        int x=matrix.length;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                ans[j][x-1]=matrix[i][j];
            }
            --x;
        }
        for(int i=0;i<ans.length;i++){
             for(int j=0;j<ans.length;j++)
             {matrix[i][j]=ans[i][j];
             }
        }
    }
}