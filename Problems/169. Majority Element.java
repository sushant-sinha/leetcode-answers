// SUSHANT SINHA

// 5ms ( 39.68% ) 54.5mb ( 6.29% )

class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;){
            
            int count=1;
            
            int x=nums[i];
            i++;
            
            while(i<nums.length && nums[i]==x){
                count++;
                i++;
            }
            
            if(count>nums.length/2)
                return x;
            
        }
        
        return 0;
        
    }
}