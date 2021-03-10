// SUSHANT SINHA
class Solution {
    static int findMaxConsecutiveOnes(int[] nums) {
        
        int count=0;
        int longest=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) count=0;
            else {
                count++;
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}