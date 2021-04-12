// SUSHANT SINHA

// 0ms ( 100% ) 36.9mb ( 49.41% )

class Solution {
    public int dominantIndex(int[] nums) {
        
        int ans=-1;
        
        for(int i=0;i<nums.length;i++){
            
            boolean ck=true;
            
            for(int j=0;j<nums.length;j++){
                
                if(nums[i]<2*nums[j] && i!=j){
                    ck=false;
                    break;
                }
                
            }
            
            if(ck){
                ans=i;
                break;
            }
        }
        
        return ans;
        
    }
}