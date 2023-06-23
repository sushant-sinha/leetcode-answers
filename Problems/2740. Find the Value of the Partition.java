// SUSHANT SINHA

// we are not concerned about the subarrays
// we just want to find the pair of numbers which will have the least diff

class Solution {
    public int findValueOfPartition(int[] nums) {
        
        Arrays.sort(nums);
        
        int diff=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length-1;i++){
            int temp= Math.abs(nums[i]-nums[i+1]);
            diff = diff > temp ? temp : diff;
        }
        
        return diff;
        
    }
}