class Solution {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        
        int r=grid.length, c=grid[0].length;
        
        int ans[][]=new int[r][c];
        
        HashSet<Integer> seen1=new HashSet<>();
        HashSet<Integer> seen2=new HashSet<>();
        
        int x,y;
        
        for(int i=0;i<r;i++){
            
            for(int j=0;j<c;j++){
                
                x=i;
                y=j;
                
                // going topleft
                --x;--y;
                while(x>=0 && y>=0){
                    seen1.add(grid[x][y]);
                    --x;--y;
                }
                
                x=i+1;y=j+1;
                
                while(x<r && y<c){
                    seen2.add(grid[x][y]);
                    x++;y++;
                }
                
                ans[i][j]=Math.abs(seen1.size()-seen2.size());
                
                seen1.clear();
                seen2.clear();
                
            }
            
        }
        
        return ans;
        
    }
}