// SUSHANT SINHA

// 15ms ( 96.06% ) 56.79mb ( 83.99% )

class Solution {
    public int minDifference(int[] nums) {

        Arrays.sort(nums);

        // System.out.println(Arrays.toString(nums));

        if(nums.length<5 || nums[0]==nums[nums.length-1])
            return 0;

        int ans=Integer.MAX_VALUE;

        /*

            i will iterate through the number reductions we are doing from the starting of the array
            i.e. number of values we have matched with the neighboring values (from start).
            This value can be maximum of 3

        */


        for(int i=0;i<=3;i++){
            
            int maxReduceCounter=3-i;

            /*

                j will iterate through the remaining number of reductions(maxReduceCounter) we can do from the back of the array
                i.e. number of values we have matched with the neighboring values (from back).
                This value depends on the number of reductions ALREADY done before, only spare moves can be used
            */

            for(int j=0;j<=maxReduceCounter;j++){

                ans=Math.min(ans, nums[nums.length-j-1]-nums[i]);

            }
        }

        return ans;
        
    }
}