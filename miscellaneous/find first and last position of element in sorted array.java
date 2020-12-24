// SUSHANT SINHA



class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int ans[]=new int[2];
        
        ans[0]=-1;ans[1]=-1;
        
        if(nums.length==0){
            
            return ans;
            
        }
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==target){
                
                ans[0]=i;
                
                while(i<nums.length){
                    
                    if(nums[i]==target)i++;
                    
                    else break;
                }
                ans[1]=--i;
                break;
            }
        }
        
        
        return ans;
 
    }
}


