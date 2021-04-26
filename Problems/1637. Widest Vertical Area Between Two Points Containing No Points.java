// SUSHANT SINHA

// 11ms ( 99.82% ) 67.5mb ( 36.43% )

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        
        int x[]= new int[points.length];
        
        for(int i=0;i<x.length;i++){
            x[i]=points[i][0];
        }
        
        int ans=0;
        
        Arrays.sort(x);
        
        for(int i=1;i<x.length;i++){
            
            ans= ans > x[i]-x[i-1] ? ans : x[i]-x[i-1];
            
        }
        
        return ans;
        
    }
}