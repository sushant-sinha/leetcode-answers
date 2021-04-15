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

