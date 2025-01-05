class Solution {
    public int waysToSplitArray(int[] nums) {

        long[] numSum=new long[nums.length];

        numSum[0]=nums[0];

        for(int i=1;i<nums.length;i++)
            numSum[i]=nums[i]+numSum[i-1];

        int ans=0;

        // System.out.println(Arrays.toString(numSum)+ " total = ");

        for(int i=0;i<nums.length-1;i++){

            // System.out.println(numSum[i]+" "+(numSum[i]-numSum[nums.length-1]));

            if(numSum[i]>(numSum[nums.length-1]-numSum[i]))
                ans++;
        }

        return ans;
        
    }
}