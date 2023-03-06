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