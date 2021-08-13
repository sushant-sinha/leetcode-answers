class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<int[]> ar=new ArrayList<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    ar.add(new int[]{i,j});
                }
            }
        }
        
        for(int i[]:ar){
            for(int a=0;a<matrix.length;a++){
                matrix[a][i[1]]=0;
            }
            
            for(int b=0;b<matrix[0].length;b++){
                matrix[i[0]][b]=0;
            }
        }
    }
}