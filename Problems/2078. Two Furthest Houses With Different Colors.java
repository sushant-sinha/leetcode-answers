// SUSHANT SINHA

// 3ms ( 22.22% ) 38.8mb ( 11.11% )
// brute force

class Solution {
    public int maxDistance(int[] colors) {
        
        int ans=0;
        
        for(int i=0;i<colors.length-1;i++){
            
            for(int j=i+1;j<colors.length;j++){
                
                if(colors[i]!=colors[j])
                    ans= ans<(j-i) ? (j-i) : ans;
                
            }
            
        }
        
        return ans;
        
    }
}