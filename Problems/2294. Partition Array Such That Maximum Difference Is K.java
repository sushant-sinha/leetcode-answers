// SUSHANT SINHA

// 39ms ( 57.14% ) 77mb ( 28.57% )

class Solution {
    public int partitionArray(int[] nums, int k) {
        
        int ans=0;
        
        Arrays.sort(nums);
        
        // System.out.println(Arrays.toString(nums));
        
        for(int i=0;i<nums.length;){
            
            int diff=0;
            int min=nums[i];
            
            i++;
            
            while(i<nums.length){
                
                diff=nums[i]-min;
                
                if(diff>k)
                    break;
                
                i++;
                
            }
            
            // System.out.println(min+" max index"+i);
            
            ans++;
            
        }
        
        return ans;
        
    }
}