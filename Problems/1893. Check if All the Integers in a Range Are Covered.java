// SUSHANT SINHA

// 0ms ( 100% ) 36.9mb ( 89.73% )

class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        
        for(int i=left;i<=right;i++){
            
            boolean found=false;
            
            for(int ar[]:ranges){
                
                if(ar[0]<=i && ar[1]>=i){
                    found=true;
                    break;
                }
                
            }
            
            if(!found)
                return false;
            
        }
        
        return true;
        
    }
}