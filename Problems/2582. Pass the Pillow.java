// SUSHANT SINHA

// 0ms ( 100% ) 39.4mb ( 100% )

class Solution {
    public int passThePillow(int n, int time) {
        
        boolean startFromRight=true;
        
        while(time>=n){
            time-=(n-1);
            startFromRight=!startFromRight;
        }
        
        if(startFromRight)
            return time+1;
        
        else
            return n-time;
        
        
    }
}