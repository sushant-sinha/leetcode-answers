// SUSHANT SINHA

// 2ms ( 66.54% ) 39mb ( 92.96% )

class Solution {
    public int partitionDisjoint(int[] nums) {

        int max=nums[0];

        for(int i=0;i<nums.length-1;i++)
        {
            // can use int flag
            boolean f=true;
            max=max>nums[i] ? max : nums[i];
            
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]<max)
                {
                    f=false;
                    break;
                }
            }

            if(f)
                return i+1;
        }
        
        return 0;
    }
}