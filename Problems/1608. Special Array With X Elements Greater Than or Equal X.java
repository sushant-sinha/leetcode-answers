// SUSHANT SINHA

// 1ms

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
            int max = nums[nums.length - 1];
            for (int x = 1; x <= max; x++) {
                int found = 0;
                int i = nums.length - 1;
                while (i >= 0 && nums[i] >= x) {
                    i--;
                    found++;
                }
                if (found == x) {
                    return x;
                }
            }
            return -1;
        
    }
}