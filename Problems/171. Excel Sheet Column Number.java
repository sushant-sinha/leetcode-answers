// SUSHANT SINHA

// 1ms ( 100% ) 39mb ( 69.99% )

class Solution {
    public int titleToNumber(String columnTitle) {
        
        int ans=0;
                
        for(int i=0;i<columnTitle.length();i++){

            /* 

                character number (for A=1, B=2......) is multiplied with 26 to the power of number of digits behind it
                
                for CABC:

                (C=3): 3*(26^3)
                        +
                (A=1): 1*(26^2)
                        +
                (B=2): 2*(26^1)
                        +
                (C=3): 3*(26^0)

                        = 53459

            */

            ans+=(columnTitle.charAt(i)-'A'+1)*Math.pow(26,columnTitle.length()-i-1);
        }
        
        return ans;
    }
}