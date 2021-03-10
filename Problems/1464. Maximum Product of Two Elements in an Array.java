// SUSHANT SINHA

// 4 ms solution

class Solution {
    public int maxProduct(int[] nums) {
        
        int max=0;
        for(int i = 0 ; i < nums.length - 1 ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                if( (nums[i]-1) * (nums[j]-1) >= max ) max = (nums[i]-1) * (nums[j]-1);
            }
        }
        
        return max;
        
    }
}

// 1 ms solution

class Solution {
    public int maxProduct(int[] nums) {
        
        Arrays.sort(nums);
        
        return (nums[nums.length-1]-1) * (nums[nums.length-2]-1) ;
        
    }
}