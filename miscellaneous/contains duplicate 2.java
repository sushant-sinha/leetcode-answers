// SUSHANT SINHA

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length>5000)return false;
        
        for(int i=0;i<(nums.length-1);i++){
            for(int j=(i+1);j<nums.length;j++){
                if(nums[j]==nums[i] && (j-i)<=k)return true;
            }
        }
        return false;
    }
}