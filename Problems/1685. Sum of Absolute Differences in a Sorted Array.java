// SUSHANT SINHA

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        
        int sum[]=new int[nums.length];
        sum[0]=nums[0];
        
        for(int i=1;i<nums.length;i++)
            sum[i]=sum[i-1]+nums[i];
        
        nums[0]=sum[nums.length-1]-(nums.length)*(nums[0]);
        nums[nums.length-1]=(nums.length)*(nums[nums.length-1])-sum[nums.length-1];
        
        for(int i=1;i<nums.length-1;i++){
            
            int lsum=(nums[i]*i)-sum[i-1];
            int rsum=sum[nums.length-1]-sum[i]-(nums[i]*(nums.length-1-i));
            nums[i]=lsum+rsum;
            
        }
        
        return nums;
        
    }
}