class Solution {
    public boolean divideArray(int[] nums) {
        
        int counter[][]=new int[501][1];
        
        for(int i:nums){
            
            counter[i][0]++;
            
        }
        
        for(int i[]:counter){
            
            if(i[0]%2!=0)
                return false;
            
        }
        
        return true;
        
    }
}