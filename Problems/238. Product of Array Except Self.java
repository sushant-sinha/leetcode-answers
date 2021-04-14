// SUSHANT SINHA

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(true){
            int pro=1;
            boolean x=true;
            for(int a:nums){
                pro*=a;
                if(a==0){
                    x=false;
                    break;
                }
            }
            
            if(x){
                for(int i=0;i<nums.length;i++)
                    nums[i]=pro/nums[i];
                return nums;
            }
                    
        }
        
        int ans[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
            ans[i]=pro(i,nums);
        
        return ans;
        
    }
    
    int pro(int k, int[] nums){
        int ans=1;
        
        for(int i=0;i<nums.length;i++){
            
            if(i==k)
                continue;
            
            if(nums[i]==0)
                return 0;
            
            ans*=nums[i];
            
        }
        
        return ans;
        
    }
}