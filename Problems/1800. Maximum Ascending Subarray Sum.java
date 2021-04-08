// SUSHANT SINHA

class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int max=nums[0];
        
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]<nums[i+1]){
                int tempmax=nums[i];
                while(i+1<nums.length && nums[i]<nums[i+1]){
                    tempmax+=nums[i+1];
                    ++i;
                }
                max = tempmax > max ? tempmax : max;
            }
            
            
        }
        
        return max;
        
    }
}