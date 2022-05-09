// SUSHANT SINHA

// 2ms ( 47.01% ) 44.6mb ( 21.02% )

class Solution {
    public int countPrefixes(String[] words, String s) {
        
        int ans=0;
        
        for(String pre:words){
            
            if(s.length()>=pre.length() && s.substring(0,pre.length()).equals(pre))
                ans++;
            
        }
        
        return ans;
        
    }
}