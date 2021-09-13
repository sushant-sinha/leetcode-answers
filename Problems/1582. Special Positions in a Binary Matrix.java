// SUSHANT SINHA

// 1ms ( 98.55% ) 38.9mb ( 93.90% )

class Solution {
    public int numSpecial(int[][] mat) {
        
        int ans=0;
        
        for(int i=0;i<mat.length;i++){
            
            for(int j=0;j<mat[0].length;j++){
                
                if(mat[i][j]==1){
                    boolean hasone=false;
                    
                    // row-wise

                    for(int a=0;a<mat[0].length;a++){
                        
                        if(mat[i][a]==1 && a!=j){
                            hasone=true;
                            break;
                        }
                        
                    }

                    // if there were no ones in row, check column
                    
                    if(!hasone){
                        for(int a=0;a<mat.length;a++){
                            
                            if(mat[a][j]==1 && a!=i){
                                hasone=true;
                                break;
                            }
                            
                        }
                    }

                    // if no one in row and column, add to the ans
                    
                    if(!hasone)
                        ans++;
                    
                }
                
            }
            
        }
        
        return ans;
        
    }
}