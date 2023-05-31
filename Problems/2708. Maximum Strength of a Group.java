class Solution {
    public long maxStrength(int[] nums) {
        
        int len=nums.length;
        
        Arrays.sort(nums);
        
        long ans=0;
        
        if(len==1)
            return nums[0];
        
        int negval=0, zeroval=0, posval=0;
        
        for(int i:nums){
            if(i>0)
                posval++;
            else if(i<0)
                negval++;
            else
                zeroval++;
        }
        
        if(zeroval==len)
            return 0;
        
        boolean flag=false;
        
        if(negval>0){
            ans=1;
            if(negval%2==0){
                for(int i=0;i<negval;i++){
                    flag=true;
                    ans*=nums[i];
                }
            }
            else{
                for(int i=0;i<negval-1;i++){
                    flag=true;
                    ans*=nums[i];
                }
            }
            
            if(!flag)
                ans=0;
        }
        
        if(posval>0){
            if(ans==0)
                ans=1;
            
            for(int i=len-posval;i<len;i++)
                ans*=nums[i];
        }
        
        return ans;
        
    }
}