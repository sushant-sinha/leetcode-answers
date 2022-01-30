// below solution worked on 23-december-2020 (410ms), but now gives TLE

class Solution {
    public void rotate(int[] nums, int k) {
        
        int ans[]=new int[nums.length];
        for(int i=0;i<k;i++){
            ans[0]=nums[nums.length-1];
            ans[nums.length-1]=nums[0];
            for(int j=0;j<(nums.length-1);j++){
                ans[j+1]=nums[j];
            }
            for (int l = 0; l < nums.length; l++) {
             nums[l] = ans[l];
         }
        }
    }
}