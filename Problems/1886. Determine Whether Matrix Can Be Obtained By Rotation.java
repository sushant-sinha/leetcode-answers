// SUSHANT SINHA

// 0ms ( 100% ) 38.2mb ( 76.05% )

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        int c0=0,c1=0;
        
        for(int i[]:mat){
            for(int j:i){
                if(j==0)
                    c0++;
                else
                    c1++;
            }
        }
        
        for(int i[]:target){
            for(int j:i){
                if(j==0)
                    c0--;
                else
                    c1--;
            }
        }
        
        if(!(c0==0 && c1==0))
            return false;
        
        int ck=0;
        int n=mat.length;
        
        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                    if(mat[x][y]!=target[x][y]){
                        ck++;
                        break;
                    }
                }
                
                if(ck!=0)
                    break;
        }
        
        if(ck==0)
            return true;
        
        
        for(int i=0;i<3;i++){
            
            rotate(n,mat);
            
            ck=0;
            
            for(int x=0;x<n;x++){
                for(int y=0;y<n;y++){
                    if(mat[x][y]!=target[x][y]){
                        ck++;
                        break;
                    }
                }
                
                if(ck!=0)
                    break;
                
            }
            
            if(ck==0){
                return true;
            }
        }
        
        return false;
        
    }
    static void rotate(int N, int mat[][]){
        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++) {
            // Consider elements in group
            // of 4 in current square
            for (int y = x; y < N - x - 1; y++) {
                // Store current cell in
                // temp variable
                int temp = mat[x][y];
 
                // Move values from right to top
                mat[x][y] = mat[y][N - 1 - x];
 
                // Move values from bottom to right
                mat[y][N - 1 - x]
                    = mat[N - 1 - x][N - 1 - y];
 
                // Move values from left to bottom
                mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];
 
                // Assign temp to left
                mat[N - 1 - y][x] = temp;
            }
        }
    }
}