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