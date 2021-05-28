// SUSHANT SINHA

// 0ms ( 100% ) 36.4mb ( 78.98% )

class Solution {
    public String tictactoe(int[][] moves) {
        
        if(moves.length<5){
            return "Pending";
        }
        
        else{
            
            char players[]={'X','O'};
            char ar[][]=new char[3][3];
            
            for(int i=0;i<moves.length;i+=2){
                ar[moves[i][0]][moves[i][1]]='X';
            }
            
            for(int i=1;i<moves.length;i+=2){
                ar[moves[i][0]][moves[i][1]]='O';
            }
            
            char winner='N';
            
            for(char c:players){
                
                boolean ans=false;
                
                if((ar[0][0]==c && ar[1][1]==c && ar[2][2]==c) || (ar[0][2]==c && ar[1][1]==c && ar[2][0]==c)){
                    winner=c;
                    break;
                }
                
                for(int i=0;i<3;i++){
                    if(ar[i][0]==c && ar[i][1]==c && ar[i][2]==c){
                        winner=c;
                        ans=true;
                        break;
                    }
                    
                    if(ar[0][i]==c && ar[1][i]==c && ar[2][i]==c){
                        winner=c;
                        ans=true;
                        break;
                    }
                }
                
                if(ans)
                    break;
            
            }
            
            if(winner=='N' && moves.length==9)
                return "Draw";
            
            else if(winner=='N')
                return "Pending";
            
            else
                return winner=='X'? "A" : "B";
            
        }
        
        
    }
}