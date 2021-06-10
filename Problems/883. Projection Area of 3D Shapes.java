// SUSHANT SINHA

class Solution {
    public int projectionArea(int[][] grid) {
        
        int ans=0;
        
        // top view
        
        for(int i[]:grid)
            for(int j:i){
                if(j!=0)
                    ans++;
            }
        
        // front view
        
        for(int i[]:grid){
            int max=0;
            for(int j:i){
                max= max>j ? max : j;
            }
            ans+=max;
        }
        
        // side view
        
        for(int i=0;i<grid[0].length;i++){
            int max=0;
            for(int j=0;j<grid.length;j++){
                max = max>grid[j][i] ? max : grid[j][i];
            }
            ans+=max;
        }
        
        return ans;
        
    }
}