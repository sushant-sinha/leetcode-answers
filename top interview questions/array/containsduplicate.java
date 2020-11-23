// SUSHANT SINHA
//using 2 for loops makes O(n*n) time complexity...which to time limit exceeded
class Solution {
    public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; ++i) {
        if (nums[i] == nums[i + 1]) return true;
    }
    return false;
}
}