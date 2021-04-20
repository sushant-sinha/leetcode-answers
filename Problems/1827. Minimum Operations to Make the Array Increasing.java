// SUSHANT SINHA

// 2ms ( 92.47% ) 39.1mb ( 97.30% )

class Solution {
    public int minOperations(int[] nums) {
        
        int count=0;
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]<=nums[i-1]){
                
                count+=nums[i-1]-nums[i]+1;
                nums[i]+=nums[i-1]-nums[i]+1;
                
            }
            
        }
        
        return count;
        
    }
}