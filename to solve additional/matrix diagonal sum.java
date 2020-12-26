// SUSHANT SINHA

// matrix diagonal sum.java

class Solution {
    public int diagonalSum(int[][] mat) {
        
        if(mat.length==0)return 0;
        if (mat.length==1)return mat[0][0];
        if (mat.length==2)return mat[0][0]+mat[0][1]+mat[1][1]+mat[1][0];
        
        int ans=0;
        
        for(int i=0;i<mat.length;i++){
            ans+=mat[i][i];
        }
        for(int i=mat.length-1;i>=0;i--){
            ans+=mat[mat.length-i-1][i];
        }
        
        if(mat.length%2!=0)
        ans-=mat[mat.length/2][mat.length/2];
        
        return ans;
        
    }
}