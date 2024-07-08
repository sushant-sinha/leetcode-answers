class Solution {
    public int minDifference(int[] nums) {

        Arrays.sort(nums);

        // System.out.println(Arrays.toString(nums));

        if(nums.length<5 || nums[0]==nums[nums.length-1])
            return 0;

        int ans=Integer.MAX_VALUE;

        for(int i=0;i<=3;i++){
            
            int maxReduceCounter=3-i;

            for(int j=0;j<=maxReduceCounter;j++){

                ans=Math.min(ans, nums[nums.length-j-1]-nums[i]);

            }
        }

        return ans;
        
    }
}