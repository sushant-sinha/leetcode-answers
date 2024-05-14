class Solution {
    public int[] numberGame(int[] nums) {

        int[] ans=new int[nums.length];

        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i+=2){
            ans[i]=nums[i+1];
            ans[i+1]=nums[i];
        }

        return ans;
        
    }
}