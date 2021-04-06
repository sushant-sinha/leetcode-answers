// SUSHANT SINHA

// with for loop to count the steps
// 2ms ( 39.58% ) 35.7mb ( 77.19% )

class Solution {
    public int minOperations(int n) {
        
        int ans=0;
        
        for(int i=0;i<n/2;i++){
            
            ans+=n-(2*i)-1;
            
        }
        
        return ans;
        
        
    }
}

// on the basis of observation
// 0ms ( 100% ) 35.7mb ( 62.99% )

class Solution {
    public int minOperations(int n) {
        
        return (n*n/4);
    }
}