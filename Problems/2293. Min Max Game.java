class Solution {
    public int minMaxGame(int[] nums) {
        
        if(nums.length==1)
            return nums[0];
        
        int len=nums.length;
        
        while(len!=1){
            
            int index=0;
            
            for(int i=0;i<len-1;i++){
                
                if(index%2==0)
                    nums[index++]=Math.min(nums[i],nums[++i]);
                
                else
                    nums[index++]=Math.max(nums[i],nums[++i]);
                
            }
            
            len/=2;
            
        }
        
        return Math.min(nums[0],nums[1]);
        
    }
}