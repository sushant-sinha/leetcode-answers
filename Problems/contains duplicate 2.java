
// This question was solved in 11/12/2020
// back then it had only 23 test cases and had input array length of 5000
// therefore, could have been solved using brute force

// this question is now updated and input size is 10^5 and there are 52 test cases.. please refer the new/updated solution

/*

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

*/