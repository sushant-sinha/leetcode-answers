// SUSHANT SINHA

// 0ms ( 100% ) 35.6mb ( 71.18% )

class Solution {
    public int numberOfMatches(int n) {
        
        int matches=0;
        
        while(n!=1){
            
            if(n%2==0){
                matches+=n/2;
                n/=2;
                continue;
            }
            
            else{
                matches+=(n/2);
                n=(n/2)+1;
                
            }
            
        }
        
        return matches;
        
    }
}