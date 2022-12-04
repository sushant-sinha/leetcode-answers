class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        // min average index
        int ans=0;
        
        long min=Long.MAX_VALUE;
        int len=nums.length;
        
        long sum[]=new long[len];
        
        sum[0]=nums[0];
        
        // modifying the array to have continuos sum
        
        for(int i=1;i<len;i++)
            sum[i]=sum[i-1]+nums[i];

        
        // going till len-2
        // because when i=len-1... len-(len-1)-1=0
        // divide by 0 exception
        
        for(int i=0;i<len-1;i++){
            
            long diff=Math.abs(Math.abs(sum[i]/(i+1))-Math.abs((sum[len-1]-sum[i])/(len-i-1)));
            
            if(diff<min){
                // System.out.println(i);
                min=diff;
                ans=i;
            }
            
        }
        
        // condition for the last element
        if(sum[len-1]/len < min)
            ans=len-1;
        
        return ans;
        
    }
}