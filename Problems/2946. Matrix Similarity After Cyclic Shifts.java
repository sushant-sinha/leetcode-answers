class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        
        int matCopy[][]= new int[mat.length][mat[0].length];
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                matCopy[i][j]=mat[i][j];
            }
        }
        
        // start rotations:
        
        
            
        for(int row=0;row<matCopy.length;row++){

            // matCopy[row]=shifter(row%2, matCopy[row], k);

            if(!Arrays.equals(shifter(row%2, matCopy[row], k), (mat[row])))
                return false;

        }

        
        
        // for(int i=0;i<mat.length;i++){

        //     for(int j=0;j<mat[0].length;j++)
        //         if(matCopy[i][j]!=mat[i][j]){
        //             return false;
        //         }
        // }
        
        return true;
        
    }
    
    int[] shifter(int dir, int[] row, int k){
        
        if(k==0)
            return row;
        
        else{
            
            if(dir==1){
                
                int last=row[row.length-1];
            
                for(int i=row.length-1;i>=1;i--){
                    
                    row[i]=row[i-1];

                }
                
                row[0]=last;
                
            }
            
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