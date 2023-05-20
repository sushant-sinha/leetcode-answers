/*

class Solution {
    
    int ans=0;
    
    public int maxMoves(int[][] grid) {

        System.out.println("len="+grid.length);
        
        for(int i=0;i<grid.length;i++){
            
            int temp=helper(i,0,grid,0,-1)-1;
            // System.out.println(temp);
            ans= ans > temp ? ans : temp;
        }
        
        return ans;
        
    }
    
    int helper(int i, int j, int[][] grid, int curSum, int oldValue){
        
        if(i<0 || i>=grid.length || j>=grid[0].length || oldValue>=grid[i][j]){
            return curSum;
        }
        
        else{
            curSum++;
        }
        
        // System.out.println("index="+i+" "+j+" "+oldValue+" sum="+curSum);
        
        int a=helper(i-1,j+1, grid, curSum, grid[i][j]);
        int b=helper(i,j+1, grid, curSum, grid[i][j]);
        int c=helper(i+1,j+1, grid, curSum, grid[i][j]);
        
        if(a>b){
            return a>c ? a : c;
        }
        
        else{
            return b>c ? b : c;
        }
        
    }
    
}

*/

class Solution {
    
    public int maxMoves(int[][] grid) {

        int score[][] = new int[grid.length][grid[0].length];

        for(int j=grid[0].length-1;j>=0;j--){
        for(int i=grid.length-1;i>=0;i--){

            

                // System.out.println("for i="+i+" j="+j);

                // left
                if(j-1>=0 && grid[i][j]>grid[i][j-1]){
                    // System.out.println("in 1");
                    score[i][j-1]= Math.max(score[i][j]+1, score[i][j-1]);
                    // continue;
                }

                // top left
                if(i-1>=0 && j-1>=0 && grid[i][j]>grid[i-1][j-1]){
                    // System.out.println("in 2");
                    score[i-1][j-1]= Math.max(score[i][j]+1, score[i-1][j-1]);
                    // score[i-1][j-1]=score[i][j]+1;
                    // continue;
                }

                // bottom left
                if(i+1<grid.length && j-1>=0 && grid[i][j]>grid[i+1][j-1]){
                    // System.out.println("in 3");
                    score[i+1][j-1]= Math.max(score[i][j]+1, score[i+1][j-1]);
                    // score[i+1][j-1]=score[i][j]+1;
                    // continue;
                }

            }

        }

        int ans=0;

        
            
            for(int i=0;i<score.length;i++)
            ans=ans>score[i][0]? ans : score[i][0];
        

        return ans;
        
    }
}