// SUSHANT SINHA

class Solution {
    public int[][] imageSmoother(int[][] img) {
        
        int ans[][]=new int[img.length][img[0].length];
        
        for(int i=0;i<img.length;i++){
            
            for(int j=0;j<img[0].length;j++){
                int sum=0;
                int ii = i-1>0 ? i-1 : 0;
                int jj = j-1>0 ? j-1 : 0;
                int imax = i+1<img.length ? i+1 : img.length-1;
                int jmax = j+1<img[0].length ? j+1 : img[0].length-1;
                                
                for(int x=ii;x<=imax;x++){
                    for(int y=jj;y<=jmax;y++){
                        sum+=img[x][y];
                    }
                }
                                
                ans[i][j]=~~(sum/((jmax-jj+1)*(imax-ii+1)));
                
            }
            
        }
        
        return ans;
        
    }
}