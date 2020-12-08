// took from https://github.com/cherryljr/LeetCode/blob/master/Jump%20Game.java

/*

Greedy O(n)

Algorithm:
We call a position in the array a "good index" if starting at that position, we can reach the last index. 
Iterating right-to-left, for each position we check if there is a potential jump that reaches a good index 
(currPosition + nums[currPosition] >= leftmostGoodIndex). 
If we can reach a GOOD index, then our position is itself GOOD. 
Also, this new GOOD position will be the new leftmost GOOD index. 
Iteration continues until the beginning of the array. 
If first position is a GOOD index then we can reach the last index from the first position.

*/

class Solution {
    public boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
}