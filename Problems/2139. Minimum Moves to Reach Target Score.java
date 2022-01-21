// SUSHANT SINHA

// 0ms ( 100% ) 37.8mb ( 35.20% )

class Solution {
    public int minMoves(int target, int maxDoubles) {
        
        int ans=0;
        
        while(target!=1){
            
            if(maxDoubles==0)
                return ans+=target-1;
            
            if(maxDoubles>0 && target%2==0){
                target/=2;
                ans++;
                maxDoubles--;
            }
            
            else{
                target--;
                ans++;
            }
            
        }
        
        return ans;
        
    }
}
