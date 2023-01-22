// SUSHANT SINHA

// 1ms ( 42.86% ) 41.1mb ( 14.29% )

class Solution {
    public int alternateDigitSum(int n) {
        
        int ans=0;
        
        int len=String.valueOf(n).length();
        
        while(n!=0){
            ans+=(-1)*Math.pow(-1,len--)*(n%10);
            // System.out.println(ans);
            n/=10;
        }
        
        return ans;
        
    }
}