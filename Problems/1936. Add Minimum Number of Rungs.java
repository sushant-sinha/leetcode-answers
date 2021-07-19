// SUSHANT SINHA

// 2ms ( 28.57% ) 51.7mb ( 28.57% )

/* 
    hardest part for me was to notice the fact that we have
    to subtract 1 when the difference is perfectly divisible 
    by dist.
*/
class Solution {
    public int addRungs(int[] rungs, int dist) {
        
        int ans=0;
        
        if(dist<rungs[0]){            
            ans+=rungs[0]/dist;
            
            /* 
                if remainder is 0 ( i.e. perfectly divisible by dist )
                subtract 1;

            */

            if(rungs[0]%dist==0)
                ans--;
        }
        
        
        for(int i=0;i<rungs.length-1;i++){
            
            if((float)(rungs[i+1]-rungs[i])/dist > 1){
                ans+=(rungs[i+1]-rungs[i])/dist;

                /* 
                    if remainder is 0 ( i.e. perfectly divisible by dist )
                    subtract 1;

                */

                if((rungs[i+1]-rungs[i])%dist==0){
                    ans--;
                }
            }
        }
        
        return ans;
        
    }
}