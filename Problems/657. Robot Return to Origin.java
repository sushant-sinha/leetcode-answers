// SUSHANT SINHA

// 5ms ( 59.43% ) 38.6mb ( 96.16% )
// we can also use string ( substring )

class Solution {
    public boolean judgeCircle(String moves) {
        
        int u=0,l=0;
        
        for(char x:moves.toCharArray()){
            
            if(x=='U')u++;
            if(x=='D')u--;
            if(x=='L')l++;
            if(x=='R')l--;
            
        }
        
        return u==0 && l==0;
        
    }
}