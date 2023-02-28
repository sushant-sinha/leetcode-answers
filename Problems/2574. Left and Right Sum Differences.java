//  SUSHANT SINHA

// 1ms ( 100% ) 42.8mb ( 85.29% )

class Solution {
    public int[] leftRigthDifference(int[] nums) {

        int len=nums.length;

        int left[]=new int[len];
        int right[]=new int[len];

        left[0]=0;
        right[len-1]=0;

        for(int i=1;i<len;i++){
            left[i]=left[i-1]+nums[i-1];
            right[len-i-1]=right[len-i]+nums[len-i];
        }

        for(int i=0;i<len;i++)
        nums[i]=Math.abs(left[i]-right[i]);

        return nums;

        
    }
}