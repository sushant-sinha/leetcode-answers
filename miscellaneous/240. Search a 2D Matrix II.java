// SUSHANT SINHA

//trying 

// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
        
//         boolean ans=false;
        
//         int i=0;j=0;
        
//         for(i=0 ;i<matrix[0].length;i++){
            
//             for(j=0 ;j<matrix.length;j++){
                
//                 if(matrix[])
                
//             }
            
//         }
        
//     }
// }

// 4ms ( 100% ) 44.4% ( 89.00% )

class Solution {
     public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
                return false;
            }
        int m = matrix.length;
        int n = matrix[0].length;
        int x = 0;
        int y = n - 1;
            while (x < m && y >= 0) {
                if (target == matrix[x][y]) {
                    return true;
                } else if (target > matrix[x][y]) {
                    x++;
                } else {
                    y--;
                }
            }
            return false;
        }
    }