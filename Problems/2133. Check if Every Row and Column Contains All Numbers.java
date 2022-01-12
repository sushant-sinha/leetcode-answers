// SUSHANT SINHA

// 13ms ( 60.49% ) 40.1mb ( 89.86% )

class Solution {
    public boolean checkValid(int[][] matrix) {
        
        int temp[]=new int[matrix.length];
        
        for(int i=0;i<matrix.length;i++){
            
            int index=0;
            
            for(int j=0; j<matrix.length; j++){
                
                temp[index++]=matrix[i][j];
                
            }
            
            Arrays.sort(temp);
            
            for(int k=1;k<=matrix.length;k++){
                
                if(temp[k-1]!=k)
                    return false;
                
            }
            
        }
        
        for(int i=0;i<matrix.length;i++){
            
            int index=0;
            
            for(int j=0; j<matrix.length; j++){
                
                temp[index++]=matrix[j][i];
                
            }
            
            Arrays.sort(temp);
            
            for(int k=1;k<=matrix.length;k++){
                
                if(temp[k-1]!=k)
                    return false;
                
            }
            
        }
        
        return true;
        
    }
}

// optimal solution

// 4ms ( 97.18% ) ( claims to be 1ms ) 83.9mb ( 79.58% )

class Solution {
    public boolean checkValid(int[][] matrix) {
        int len = matrix.length, xor = 0;
        for(int i = 1; i <= len; i++){
            xor ^= i;
        }
        for(int[] arr : matrix){
            int x = xor;
            for(int n : arr){
                x ^= n;
            }
            if(x != 0){
                return false;
            }
        }
        for(int c = 0; c < len; c++){
            int x = xor;
            for(int r = 0; r < len; r++){
                x ^= matrix[r][c];
            }
            if(x != 0){
                return false;
            }
        }
        return true;    
    }
}