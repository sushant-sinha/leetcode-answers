class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        
        int ans = 0;
        
        for(int i = 0 ; i < timeSeries.length-1 ; i++){
            
            //ans += Math.min(duration, timeSeries[i+1]-timeSeries[i]);
            ans+= duration<timeSeries[i+1]-timeSeries[i] ? duration : timeSeries[i+1]-timeSeries[i];
        }
        
        return ans + duration;
    }
}