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