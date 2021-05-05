// SUSHANT SINHA

class Solution {
    public int jump(int[] nums) {
        
        if(nums.length==2)
            return 1;
        
        int ans=0;
        int index=nums.length-1;
        
        while(index!=0){
            
            int temp=Integer.MAX_VALUE;
            
            for(int distance=1;distance<=index;distance++){
                
                if(nums[index-distance]>=distance){
                    temp = distance;
                }
                
            }
            
            index-=temp;
            ans++;
            
        }
        
        return ans;
        
    }
}