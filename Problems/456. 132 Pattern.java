// SUSHANT SINHA

// this code gives TLE now
// stack implementation is needed see below -> https://leetcode.com/problems/132-pattern/discuss/2015130/Going-from-O(N3)-greater-O(N2)-greater-O(N)-%2B-MEME

// TLE now ..... Before -> 132ms ( 12.59% ) 39mb ( 75.56% )

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

// 38ms ( 48.59% ) 61.3mb ( 84.51% )

class Solution {
    public boolean find132pattern(int[] nums) {
        
        Stack<Integer> st = new Stack<>();
        
        int thirdElement = Integer.MIN_VALUE;
        
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] < thirdElement) return true;
            while(!st.isEmpty() && st.peek() < nums[i]) thirdElement = st.pop();
            st.push(nums[i]);
        }
        return false;
    }
}