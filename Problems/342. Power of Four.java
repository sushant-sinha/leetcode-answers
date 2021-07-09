// SUSHANT SINHA

// not the expected approach.... but works
// 2ms ( 12.99% ) 38mb ( 8.40% )

class Solution {
    public boolean isPowerOfFour(int n) {
        
        if(n<=0)
            return false;
        
        while(n!=1){
            
            if(n%4==0)
                n/=4;
            
            else
                return false;
            
        }
        
        return true;
        
    }
}

// expected solution... no loops needed
// 2ms ( 12.99% ) 38mb ( 9.76% )
// by https://leetcode.com/Abhishekpatel_/

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0)
            return false;
        return (Math.log(n)/Math.log(4)) % 1 == 0;
    }
}