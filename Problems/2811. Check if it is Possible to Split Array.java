// 1ms O(n) (98.95% ) 42.53mb O(1) ( 90.72% )

// intuition from:
// https://leetcode.com/problems/check-if-it-is-possible-to-split-array/solutions/3869991/explained-o-n-check-consecutive-sum-only/

class Solution {
    public boolean canSplitArray(List<Integer> nums, int m) {

        // check if there is a possibility to get two consecutive numbers sum to m or more
        // then we return true. Becaues we can now remove the leading and trailing numbers one by one by keeping this pair as the one to have more than two number wala pair and the remaining being the subarray with len=1

        if(nums.size()<3)
            return true;
        
        for(int i=0;i<nums.size()-1;i++){

            if(nums.get(i)+nums.get(i+1)>=m)
                return true;
        }
        return false;
        
    }
}