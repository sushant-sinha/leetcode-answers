// SUSHANT SINHA

// 2ms ( 49.63% ) 44.49mb ( 18.68% )

class Solution {
    public int minimumCost(int[] nums) {
        
        int ans=nums[0];
        
        // sorting to prevent myself from writing a for loop
        Arrays.sort(nums);
        
        if(nums[0]!=ans && nums[1]!=ans && nums[2]!=ans){
            ans+=nums[0]+nums[1];
        }
        
        else{
            ans+=nums[0]+nums[1]+nums[2]-ans;
        }
        
        return ans;
        
    }
}

class Solution {
    public int minimumCost(int[] nums) {
        
        int ans=nums[0];
        
        int min1=Integer.MAX_VALUE;
        int min2=min1;
        
        for(int i=1;i<nums.length;i++){

            if(nums[i]<=min1){
                min2=min1;
                min1=nums[i];
            }

            else if(nums[i]<=min2){
                min2=nums[i];
            }

        }
        
        return ans+min1+min2;
        
    }
}