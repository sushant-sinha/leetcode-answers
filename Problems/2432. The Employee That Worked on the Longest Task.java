// SUSHANT SINHA

// 2ms ( 73.85% ) 54mb ( 50.86% )

class Solution {
    public int hardestWorker(int n, int[][] logs) {
        
        int maxTime=-1;
        
        int curTime=0;
        
        int ans=0;
        
        for(int i=0;i<logs.length;i++){
            
            //System.out.println(ans+" start "+maxTime+" "+curTime);
            
            if(logs[i][1]-curTime>=maxTime){
                
                if(logs[i][1]-curTime==maxTime){
                    
                    if(logs[i][0]<ans){
                        ans=logs[i][0];
                        curTime=logs[i][1];
                        //System.out.println(ans+" hi "+maxTime);
                        continue;
                    }
                    
                    else{
                        curTime=logs[i][1];
                        //System.out.println(ans+" hi "+maxTime);
                        continue;
                    }
                    
                }
                
                
                ans=logs[i][0];
                maxTime=logs[i][1]-curTime;
                //System.out.println(ans+" "+maxTime);
                
            }
            
            curTime=logs[i][1];
            
        }
        
        return ans;
        
    }
}