// SUSHANT SINHA

// 1ms ( 25.16% ) 37.2mb ( 26.63 )

class Solution {
    public int maxDepth(String s) {
        
        int ans=0,cur=0;
        
        for(int i=0;i<s.length();i++){
            
            
            if(s.charAt(i)=='('){
                
                cur++;
                ans= ans > cur ? ans : cur;
            }
            if(s.charAt(i)==')')
                cur--;
            
        }
        
        return ans;
        
    }
}