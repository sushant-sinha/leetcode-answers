// SUSHANT SINHA

// 0ms ( 100% ) 36.5mb ( 63.39% )

class Solution {
    public int largestAltitude(int[] gain) {
               
        for(int i=1;i<gain.length;i++){
            
            gain[i]+=gain[i-1];
            
        }
        
        int ans=0;
        
        for(int x:gain){
            ans = ans>x ? ans : x;
        }
        
        return ans;
        
    }
}