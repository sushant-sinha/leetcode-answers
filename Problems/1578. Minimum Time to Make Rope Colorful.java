// SUSHANT SINHA

// 17ms ( 44.20% ) 88.8mb ( 81.90% )

class Solution {
    public int minCost(String colors, int[] neededTime) {
        
        int ans=0;
        
        int start=0, end=0, len=colors.length();
        
        while(end!=len){
            
            char col=colors.charAt(start);
            
            end++;
            
            while(end<len && colors.charAt(end)==col){
                end++;
            }
            
            // find minimum from the subarray of start->end-1
            
            ans+=sumval(neededTime, start, end);
            
            start=end;
            
        }
        
        return ans;
        
    }
    
    int sumval(int[] needTime, int start, int end){
        
        int sum=0, max=-1;
        
        for(int i=start;i<end;i++){
            sum+=needTime[i];
            
            if(needTime[i]>max)
                max=needTime[i];
        }
        
        return sum-max;
        
    }
}