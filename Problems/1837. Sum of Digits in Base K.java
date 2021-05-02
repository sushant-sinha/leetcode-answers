// SUSHANT SINHA

// 0ms ( 100% ) 35.3mb ( 98.16% )

class Solution {
    public int sumBase(int n, int k) {
        
        if(n==k)
            return 1;
        
        int ans=0;
        
        while(n>=k){
            
            ans+=(n%k);
            n/=k;
            
        }
        
        ans+=n;
        
        return ans;
        
    }
}