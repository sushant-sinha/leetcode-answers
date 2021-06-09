// SUSHANT SINHA

// 0ms ( 100% ) 36.2mb ( 78.02% )

class Solution {
    public int numRookCaptures(char[][] board) {
        
        int ans=0;
        
        int x=0,y=0;
        
        for(int i=0;i<8;i++)
            for(int j=0;j<8;j++)
                if(board[i][j]=='R'){
                    x=i;y=j;
                    break;
                }
        
        for(int i=x;i<8;i++){
            if(board[i][y]=='B')
                break;
            else if(board[i][y]=='p'){
                ans++;
                break;
            }
        }
        
        for(int i=x;i>=0;i--){
            if(board[i][y]=='B')
                break;
            else if(board[i][y]=='p'){
                ans++;
                break;
            }
        }
        
        for(int i=y;i<8;i++){
            if(board[x][i]=='B')
                break;
            else if(board[x][i]=='p'){
                ans++;
                break;
            }
        }
        
        for(int i=y;i>=0;i--){
            if(board[x][i]=='B')
                break;
            else if(board[x][i]=='p'){
                ans++;
                break;
            }
        }
        
        return ans;
        
    }
}