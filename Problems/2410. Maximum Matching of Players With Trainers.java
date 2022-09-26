// SUSHANT SINHA

// 49ms ( 33.49 ) 79.2mb ( 73.80% )

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
        Arrays.sort(players);
        Arrays.sort(trainers);
        
        int ans=0, i=0, j=0;
        
        int len=trainers.length;
        
        for(;i<players.length;i++){
            
            while(j<len && trainers[j]<players[i]){
                
                //System.out.println(j);
                j++;
                
            }
            
            if(j<len && trainers[j]>=players[i]){
                j++;
                ans++;
            }
            
            else
                return ans;
            
        }
        
        return ans;
        
    }
}