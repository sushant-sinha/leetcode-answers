class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        //System.out.println(nums.length);
        
        long ans=0;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==0){
                
                long len=0;
                
                while(i<nums.length && nums[i]==0){
                    len++;
                    i++;
                }
                
                //System.out.println(len);
                
                ans+=helper(len);
                
            }
            
        }
        
        return ans;
        
    }
    
    long helper(long n){
        
        return (n*(n+1)/2);
        
    }
    
}