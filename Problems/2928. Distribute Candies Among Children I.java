// SUSHANT SINHA

// 1ms 39.8mb

class Solution {
    public int distributeCandies(int n, int limit) {
        
        int ans=0;
        
        for(int i=0;i<=limit && i<=n;i++){
            
            for(int j=0;j<=limit && (j<=n-i); j++){
                
                if(n-i-j<=limit){
                    ans++;
                    // System.out.println(i+" "+j+" "+(n-j-i));
                }
                
            }
        }
        
        return ans;
        
    }
}