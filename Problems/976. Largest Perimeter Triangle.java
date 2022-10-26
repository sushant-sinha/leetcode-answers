// SUSHANT SINHA

// 8ms ( 99.70% ) 42.5mb ( 92.17% )

// initually the intuition was for using the O(n^3) solution and trying all the possible combos
// but... that will obviously lead to TLE..

// the solution is to sort the input and then find the largest triplet that satisfies the condition of triangle
// this isn't considering the condition which is: a-b<c

class Solution {
    public int largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int i=nums.length-1; i>=2; i--){
            
            if(nums[i]<(nums[i-1]+nums[i-2]))
                return (nums[i]+nums[i-1]+nums[i-2]);
            
        }
        
        return 0;
        
    }
}