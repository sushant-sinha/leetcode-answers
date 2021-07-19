// SUSHANT SINHA

// 2ms ( 28.57% ) 51.7mb ( 28.57% )

class Solution {
    public int addRungs(int[] rungs, int dist) {
        
        int ans=0;
        
        if(dist<rungs[0]){            
            ans+=rungs[0]/dist;
            
            if(rungs[0]%dist==0)
                ans--;
        }
        
        
        for(int i=0;i<rungs.length-1;i++){
            
            if((float)(rungs[i+1]-rungs[i])/dist > 1){
                ans+=(rungs[i+1]-rungs[i])/dist;
                if((rungs[i+1]-rungs[i])%dist==0){
                    ans--;
                }
            }
        }
        
        return ans;
        
    }
}