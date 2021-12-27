// SUSHANT SINHA

// 2ms ( 100% ) 38.3mb ( 100% )

class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int ans=0;
        
        for(String s:sentences){
            
            String temp[]=s.split(" ");
            
            ans = ans > temp.length ? ans : temp.length;
            
        }
        
        return ans;
        
    }
}