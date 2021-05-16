// SUSHANT SINHA

class Solution {
    public int triangleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);
        int ans = 0;
        
        for (int k = 2; k < nums.length; k++) {
            for (int i = 0, j = k - 1; i < j; ) {
                if (nums[i] + nums[j] > nums[k]) {
                    ans += j - i;
                    j--;
                }
                
                else {
                    i++;
                }
            }
        }
        return ans;
    }
}