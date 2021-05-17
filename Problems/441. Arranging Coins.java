// SUSHANT SINHA

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