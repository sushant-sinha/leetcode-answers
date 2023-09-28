class Solution {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        
        // since the array size withtin the limits of brute force:
        
        // checking all the possible indexes to be the mountain peak
        
        int len=maxHeights.size();
        
        long ans=0;
        
        for(int i=0;i<len;i++){
            
            int peak=maxHeights.get(i);
            
            long curVal=peak;
            int prev=peak;
            
            for(int j=i-1; j>=0; j--){
                if(maxHeights.get(j)<prev){
                    prev=maxHeights.get(j);
                    curVal+=prev;
                    
                }
                
                else{
                    curVal+=prev;
                }
            }
            
            prev=peak;
            
            for(int j=i+1; j<len; j++){
                if(maxHeights.get(j)<prev){
                    prev=maxHeights.get(j);
                    curVal+=prev;
                    
                }
                
                else{
                    curVal+=prev;
                }
            }
            
            ans=ans>curVal ? ans : curVal;
        }
        
        return ans;
        
    }
}