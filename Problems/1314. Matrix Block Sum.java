// SUSHANT SINHA

// my solution....... brute force 🤣🤣
// 133ms ( 14.93% ) 40.3mb ( 30.93% )

class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        
        int ans[][]=new int[mat.length][mat[0].length];
        
        for(int i=0;i<mat.length;i++){
            
            for(int j=0;j<mat[0].length;j++){
                
                int r[]=new int[2];
                int c[]=new int[2];
                
                r[0] = Math.max(0,(i-k));
                r[1] = (i+k)>=mat.length ? mat.length-1 : (i+k);
                
                c[0] = Math.max(0,j-k);
                c[1] = (j+k)>=mat[0].length ? mat[0].length-1 : (j+k);
                
                
                
                int sum=0;
                
                for(int x=r[0];x<=r[1];x++){
                    for(int y=c[0];y<=c[1];y++){
                     
                        sum+=mat[x][y];
                        
                    }
                    
                }
                
                ans[i][j]=sum;
                
                
            }
            
        }
        
        return ans;
        
    }
}


