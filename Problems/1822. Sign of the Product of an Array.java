// SUSHANT SINHA

class Solution {
    public int arraySign(int[] nums) {
        
        int neg=1;
        
        for(int i:nums){
            
            if(i<0){
                neg*=-1;
            }
            
            if(i==0)
                return 0;
            
        }
        
        return neg;
        
    }
}