// SUSHANT SINHA

// using the sum of previous elements
// 1307ms( 5.83% ) 42.6mb ( 10.17% )

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int ans=0;
        if(nums[0]==k)
            ans++;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==k)
                ans++;
            
            nums[i]+=nums[i-1];
            if(nums[i]==k)
                ans++;
        }
        
        for(int i=1;i<nums.length-1;i++){
            
            for(int j=i+1;j<nums.length;j++){
                
                if(nums[j]-nums[i-1]==k)
                    ans++;
                
            }
            
        }
        
        return ans;
        
    }
}
