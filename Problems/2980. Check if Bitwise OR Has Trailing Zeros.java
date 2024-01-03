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