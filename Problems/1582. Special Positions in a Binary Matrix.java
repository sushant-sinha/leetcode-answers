class Solution {
    public int numSpecial(int[][] mat) {
        
        int ans=0;
        
        for(int i=0;i<mat.length;i++){
            
            for(int j=0;j<mat[0].length;j++){
                
                if(mat[i][j]==1){
                    boolean hasone=false;
                    
                    for(int a=0;a<mat[0].length;a++){
                        
                        if(mat[i][a]==1 && a!=j){
                            hasone=true;
                            break;
                        }
                        
                    }
                    
                    if(!hasone){
                        for(int a=0;a<mat.length;a++){
                            
                            if(mat[a][j]==1 && a!=i){
                                hasone=true;
                                break;
                            }
                            
                        }
                    }
                    
                    if(!hasone)
                        ans++;
                    
                }
                
            }
            
        }
        
        return ans;
        
    }
}