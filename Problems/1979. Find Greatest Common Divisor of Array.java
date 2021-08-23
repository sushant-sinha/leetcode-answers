// SUSHANT SINHA

// 2ms ( 28.57% ) 38.9mb ( 28.57% )

class Solution {
    public int findGCD(int[] nums) {
        
        Arrays.sort(nums);
        
        int ans=1;
        
        if(nums[0]==nums[nums.length-1] || nums[nums.length-1]%nums[0]==0)
            return nums[0];
        
        for(int i=1;i<=nums[0]/2;i++){
            
            if(nums[0]%i==0 && nums[nums.length-1]%i==0)
                ans=i;
            
        }
        
        return ans;
        
    }
}

// using for loop instead of Arrays.sort()

// 0ms ( 100% ) 38.9mb ( 28.57% )

class Solution {
    public int findGCD(int[] nums) {
        
        //Arrays.sort(nums);
        
        int min=1001,max=0;
        
        for(int i:nums){
            
            min= i<min ? i : min;
            max= i>max ? i : max;
            
        }
        
        int ans=1;
        
        if(min==max || max%min==0)
            return min;
        
        for(int i=1;i<=min/2;i++){
            
            if(min%i==0 && max%i==0)
                ans=i;
            
        }
        
        return ans;
        
    }
}