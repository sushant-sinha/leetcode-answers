// SUSHANT SINHA

// 0ms ( 100% ) 36.7mb ( 100% )

class Solution {
    public int minTimeToType(String word) {
                
        int ans=0;
        
        int temp=0;
        
        for(char c:word.toCharArray()){
            
            int x=temp-((int)c-'a');
            
            x= x<0 ? -1*x : x;
            
            ans+= x>12 ? 26-x : x;
                        
            ans++;
            
            temp=c-'a';
            
        }
        
        return ans;
        
    }
}