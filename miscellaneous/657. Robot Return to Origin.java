// SUSHANT SINHA

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