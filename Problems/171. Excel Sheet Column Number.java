// SUSHANT SINHA

// 1ms ( 100% ) 39mb ( 69.99% )

class Solution {
    public int titleToNumber(String columnTitle) {
        
        int ans=0;
                
        for(int i=0;i<columnTitle.length();i++){
            ans+=(columnTitle.charAt(i)-'A'+1)*Math.pow(26,columnTitle.length()-i-1);
        }
        
        return ans;
    }
}