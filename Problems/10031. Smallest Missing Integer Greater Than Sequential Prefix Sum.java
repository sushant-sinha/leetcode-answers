// SUSHANT SINHA

// 1ms ( 100% ) 41.96mb ( 25.00% )

class Solution {
    public int missingInteger(int[] nums) {
        
        int sum=nums[0];
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]!=nums[i-1]+1)
                break;
            
            else
                sum+=nums[i];
        }
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==sum){
                ++sum;
                continue;
            }
            
            if(sum<nums[i])
                return sum;
        }
        
        return sum;
        
    }
}