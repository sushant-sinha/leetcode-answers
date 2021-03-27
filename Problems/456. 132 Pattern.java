// SUSHANT SINHA

// hint solution
// 132ms ( 12.59% ) 39mb ( 75.56% )

// ideal solution has stack implementation

class Solution {
    public boolean find132pattern(int[] nums) {

        if (nums == null || nums.length < 3) return false;

        for (int j = 1; j < nums.length; j++) {
            int numJ = nums[j];

            int lowestInLeft = Integer.MAX_VALUE;
            for (int i = 0; i < j; i++) {
                lowestInLeft = Math.min(lowestInLeft, nums[i]);
            }

            if (lowestInLeft < numJ) {

                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[k] < numJ && lowestInLeft < nums[k]) {
                        return true;
                    }

                }

            }

        }
        return false;

    }
}

