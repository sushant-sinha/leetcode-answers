// SUSHANT SINHA

// 0ms ( 100% ) 38.3mb ( 87.88% )

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