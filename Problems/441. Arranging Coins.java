// SUSHANT SINHA

// 6ms ( 47.09% ) 36.4mb ( 17.25% )

class Solution {
    public int arrangeCoins(int n) {
        
        int ans=0, count=0;
        while(++count<=n){
            ans++;
            n-=count;
        }
        
        return ans;
        
    }
}