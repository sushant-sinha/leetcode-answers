// SUSHANT SINHA

// 2ms ( 52.58% ) 43.86%  ( 75.11% )

class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        
        int matCopy[][]= new int[mat.length][mat[0].length];
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                matCopy[i][j]=mat[i][j];
            }
        }
            
        for(int row=0;row<matCopy.length;row++){

            // dir = 0 is for left shift
            if(!Arrays.equals(shifter(row%2, matCopy[row], k), (mat[row])))
                return false;

        }

        
        return true;
        
    }
    
    int[] shifter(int dir, int[] row, int k){
        
        if(k==0)
            return row;
        
        else{
            
            // right shift
            if(dir==1){
                
                int last=row[row.length-1];
            
                for(int i=row.length-1;i>=1;i--){
                    
                    row[i]=row[i-1];

                }
                
                row[0]=last;
                
            }
            
            // left shift
            else{
                
                int first=row[0];
            
                for(int i=0;i<row.length-1;i++){
                    
                    row[i]=row[i+1];

                }
                
                row[row.length-1]=first;
                
                
            }
            
            return shifter(dir, row, k-1);
        }
        
    }
}