// SUSHANT SINHA

// my solution

class Solution {
    public int countNegatives(int[][] grid) {
              
        int ans=0;
        for(int[] a:grid){
            for(int b:a){
                if(b<0)ans++;
            }
        }
        return ans;
    }
}

// best solution

class Solution {
    public int countNegatives(int[][] grid) {
        int cnt=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    cnt+=grid[i].length-j;
                    break;
                }
            }
        }
        return cnt;
    }
}