// SUSHANT SINHA

// 4ms ( 66.67% ) 39.7mb ( 77.78% )

class Solution {
    public int sumOfMultiples(int n) {
        
        int ans=0;
        
        while(n>2){
            
            if(n%3==0 || n%5==0 || n%7==0)
                ans+=n;
            
            n--;
            
        }
        
        return ans;
        
    }
}