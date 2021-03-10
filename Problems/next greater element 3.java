// Took from https://github.com/cherryljr/LeetCode/blob/master/Next%20Greater%20Element%20III/Next%20Greater%20Element%20III.java

class Solution {
    public int nextGreaterElement(int n) {
        char[] nums = (n + "").toCharArray();
        int index = nums.length - 2;
        // find the first pair of two successive numbers nums[index] and nums[index + 1]
        // from the right, which satisfy nums[index] < [index + 1]
        while (index >= 0 && nums[index] >= nums[index + 1]) {
            index--;
        }
        if (index < 0) {
            return -1;
        }

        // swap the number nums[index] and the number a[larger] which is just larger than itself 
        int larger = nums.length - 1;
        while (larger > 0 && nums[larger] <= nums[index]) {
            larger--;
        }
        swap(nums, index, larger);
        // reverse the numbers following a[index] to get the next smallest lexicographic permutation
        return reverse(nums, index + 1);
    }

    private void swap(char[] nums, int i, int j) {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private int reverse(char[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }

        long num = Long.valueOf(String.valueOf(nums));
        return num > Integer.MAX_VALUE ? -1 : (int)num;
    }

}

