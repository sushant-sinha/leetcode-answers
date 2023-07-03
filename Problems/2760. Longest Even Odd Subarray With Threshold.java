// SUSHANT SINHA

// 18ms ( 33.33% ) 43.6mb ( 66.67% )

class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        
        if(nums.length==1){
            if(nums[0]%2==0 && nums[0]<=threshold)
                return 1;
            else
                return 0;
        }
        
        int ans=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]%2!=0)
                continue;
            
            int j=i;
            
            boolean even=true;
            
            for(;j<nums.length;j++){
                
                if(even){
                    if(nums[j]%2==0 && nums[j]<=threshold){
                        even=!even;
                        continue;
                    }
                    else{
                        --j;
                        break;
                    }
                }
                
                else if(nums[j]%2!=0 && nums[j]<=threshold){
                    even=!even;
                    continue;
                }
                
                else{
                    --j;
                    break;
                }
                
            }
            // System.out.println(i+" "+j);
            
            if(j==nums.length)
                --j;
            
            ans= Math.max(ans, j-i+1);
            
        }
        
        return ans>0 ? ans : 0;
        
    }
}