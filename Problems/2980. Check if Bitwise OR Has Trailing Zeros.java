// SUSHANT SINHA

// 1ms ( 91.43% ) 44.26mb ( 53.88% )

class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        
        boolean flagIsEven=false;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]%2==0){
                
                if(!flagIsEven)
                    flagIsEven=true;
                else
                    return true;
            }
                
        }
        
        return false;
        
    }
}