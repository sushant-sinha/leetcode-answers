// SUSHANT SINHA

// 1ms ( 100% )

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++){
            
            // reset the counter
            int counter=0;
            
            
            // check the boundary condition whether 1 is the last element or not
            if(nums[i]==1 && (i+1)!=nums.length){
                ++i;
                while(i<nums.length && nums[i]==0){
                    counter++;
                    i++;
                }
                --i;
                
                // check the counter....and also whether the while loop ended because of end of array
                if(counter<k && i+1!=nums.length){
                    return false;
                    }
                else continue;
                
            }
            
        }
        
        return true;
        
    }
}