// SUSHANT SINHA

// 1ms ( 78.58% ) 38.5mb ( 71.25% )

class Solution {
    public int minOperations(String[] logs) {
        
        int ans=0;
        
        for(String x:logs){
            
            if(!x.equals("../") && !x.equals("./")){
                
                ans++;                
                continue;
                
            }
            
            if(x.equals("../")){
                
                ans = ans>0 ? --ans : 0;
                
            }
            
            
        }
        
        return ans>0 ? ans : 0;
        
    }
}