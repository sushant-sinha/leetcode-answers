// SUSHANT SINHA

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        
        int ans1=0,ans2=0;
        int s=start;
        
        while(s!=destination){
            ans1+=distance[s];
            ++s;
            if(s==distance.length)s=0;
        }
        
        while(destination!=start){
            ans2+=distance[destination];
            ++destination;
            if(destination==distance.length)destination=0;
        
        }
        
        return ans1>ans2 ? ans2 : ans1;
        
    }
}