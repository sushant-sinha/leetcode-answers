// SUSHANT SINHA


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