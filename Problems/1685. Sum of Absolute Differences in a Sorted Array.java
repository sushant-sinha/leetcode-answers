// SUSHANT SINHA

// 3ms ( 78.26% ) 59.3mb ( 18.69% )

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        
        // this sum array can be eliminated by using a simple variable whose value is being updated in every iteration of last loop
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

// best solution
// 2ms ( 100% ) 53.9mb ( 40.50% )

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++)
        {
           sum1+=nums[i];
        }
        for(int i=0;i<n;i++)
        {
           sum1-=nums[i];
           result[i]=(sum1-(n-i-1)*nums[i])+(i*nums[i]-sum2);
           sum2+=nums[i];
        }
        return result;
    }
}