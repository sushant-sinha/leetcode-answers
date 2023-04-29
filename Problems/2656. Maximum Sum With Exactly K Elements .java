// SUSHANT SINHA

// 7ms ( 16.67% ) 43.1mb ( 16.67% )

class Solution {
    public int maximizeSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int max=nums[nums.length-1];
        
        // for(int i=0;i<k;i++){
        
        //     ans+=max++;
            
        // }

        if(k==1)
        return max;

        if(k==2)
        return max*2+1;
        
        return (max*k)+((k-1)*(k)/2);
        
    }
}