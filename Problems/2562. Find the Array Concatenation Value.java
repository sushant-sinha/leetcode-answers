// SUSHANT SINHA

// 1ms ( 97.89% ) 41.8mb ( 66.91% )

class Solution {
    public long findTheArrayConcVal(int[] nums) {
        
        long ans=0;
        int len=nums.length;
        
        for(int i=0;i<len/2;i++){
            
            ans+=help(nums[i], nums[len-i-1]);
            
        }
        
        if(len%2==1)
            ans+=nums[len/2];
        
        return ans;
        
    }
    
    long help(int a, int b){
        
        return (long)((a*Math.pow(10, String.valueOf(b).length()))+b);
        
    }
}