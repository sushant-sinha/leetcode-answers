// SUSHANT SINHA

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int mat[]=new int[matrix.length*matrix.length];
        int i=0;
        for(int x[]:matrix){
            for(int y:x){
                mat[i++]=y;
            }
        }
        
        Arrays.sort(mat);
        
        return mat[k-1];
        
    }
}