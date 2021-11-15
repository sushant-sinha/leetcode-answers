// SUSHANT SINHA

// 1ms ( 66.67% ) 36.5mb ( 88.89% )

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        int ans=0;
        
        while(tickets[k]!=0){
            
            for(int i=0;i<tickets.length;i++){
                
                if(tickets[i]>0){
                    ans++;
                    tickets[i]--;
                }
                
                if(tickets[k]==0)
                    return ans;
                
            }
            
        }
        
        return ans;
        
    }
}