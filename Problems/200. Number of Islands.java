// SUSHANT SINHA

// 5ms ( 55.04% ) 57.5mb ( 50.15% )

class Solution {
   
    char[][] flag;

    public int numIslands(char[][] grid) {
        
        flag=grid;
        
        int ans=0;
        
        int m=grid.length;
        int n=grid[0].length;
        
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                
                if(grid[i][j]=='1'){
                    
                    ans++;
                    
                    fill(i, j, m, n);
                    
                }
                
            }
            
        }
        
        return ans;
        
        
    }
    
   void fill(int i,int j, int m, int n){
       
       if(i>=m || i<0 || j>=n || j<0 || flag[i][j]=='0')
           return;
       
       else{
           flag[i][j]='0';
       }
       
       fill(i+1,j,m,n);
       fill(i,j+1,m,n);
       fill(i-1,j,m,n);
       fill(i,j-1,m,n);
           
       
   }
}