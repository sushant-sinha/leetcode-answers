// SUSHANT SINHA

// 4ms ( 96.33% ) 39.1mb ( 82.94% )

class Solution {
    public int minFlips(String target) {
        
        int ans=0;
        char x='0';
        
        for(char c:target.toCharArray()){
            
            if(c==x)
                continue;
            
            ans++;
            
            x = x=='0' ? '1' : '0';
            
        }
        
        return ans;
        
    }
}