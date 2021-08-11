// SUSHANT SINHA

// 6ms ( 33.12% ) 39.6mb ( 39.58% )

class Solution {
    public int minFlipsMonoIncr(String s) {
        
        int ans=0,one=0;
        
        for(char c:s.toCharArray()){
            if(c=='1')
                one++;
            else{
                ans= ans+1<one ? ans+1 : one;
            }
        }
        
        return ans;
        
    }
}
