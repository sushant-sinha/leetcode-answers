class Solution {
    public long largestPerimeter(int[] nums) {

        Arrays.sort(nums);

        long ans=0;

        long curSum=nums[0]+nums[1];

        for(int i=2;i<nums.length;i++){

            if(curSum>nums[i]){

                curSum+=nums[i];
                ans=curSum;

            }

            else{
                curSum+=nums[i];
            }
        }

        return ans==0 ? -1 : ans;
        
    }
}