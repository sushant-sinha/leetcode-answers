// SUSHANT SINHA

// Brute force
// 0ms( 100% ) 38.1mb ( 95.18% )

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int a[]:matrix){
            for(int b:a)
                if(b==target)
                    return true;
        }
        
        return false;
    }
}

// 0ms( 100% ) 38.7mb ( 15.35% )

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        
        for(int i=0;i<m;i++){
            
            if(matrix[i][n-1]>=target){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==target)
                        return true;
                }
            }
        }
        
        return false;
    }
}