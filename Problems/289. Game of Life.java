// SUSHANT SINHA

// not the inplace solution..
// 0ms ( 100% ) 37.3mb ( 78.18% )

class Solution {
    public void gameOfLife(int[][] board) {
        
        int ans[][]=new int[board.length][board[0].length];
        
        for(int i=0;i<board.length;i++){
            
            for(int j=0;j<board[0].length;j++){
                int sum=0;
                
                // top exists
                
                if(i-1>=0){
                    sum+=board[i-1][j];
                }
                
                // bottom exists
                
                if(i+1<board.length){
                    sum+=board[i+1][j];
                }
                
                // left exists
                
                if(j-1>=0){
                    sum+=board[i][j-1];
                    
                    // and top exists
                    
                    if(i-1>=0)
                        sum+=board[i-1][j-1];
                    
                    // and bottom exists
                    
                    if(i+1<board.length)
                        sum+=board[i+1][j-1];
                    
                }
                
                // right exists
                
                if(j+1<board[0].length){
                    sum+=board[i][j+1];
                    
                    // and top exists
                    
                    if(i-1>=0)
                        sum+=board[i-1][j+1];
                    
                    // and bottom exists
                    
                    if(i+1<board.length)
                        sum+=board[i+1][j+1];
                    
                }
                
                // updating according to the conditions
                
                if(board[i][j]==1){
                    if(sum==2 || sum==3)
                        ans[i][j]=1;
                    
                    else if(sum>3)
                        ans[i][j]=0;
                    
                    else if(sum<2)
                        ans[i][j]=0;
                }
                
                else
                    ans[i][j]= sum==3 ? 1 : 0;
                
            }
            
        }
        
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
                board[i][j]=ans[i][j];
        
        
    }
}