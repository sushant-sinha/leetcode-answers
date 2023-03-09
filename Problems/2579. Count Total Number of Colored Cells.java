// SUSHANT SINHA

// 0ms ( 100% ) 39.6mb ( 43.83% )

class Solution {
    public long coloredCells(int n) {
        
        n-=1;
        
        return (2*((long)n*n))+(2*n+1);
    }
}