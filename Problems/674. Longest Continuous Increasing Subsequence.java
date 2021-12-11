// SUSHANT SINHA

// 1ms ( 99.30% ) 39.5mb ( 92.93% )

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int ans=1, temp=1;
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]>nums[i-1]){
                temp++;
                ans= temp>ans ? temp : ans;
            }
            
            else
                temp=1;
            
        }
        
        return ans;
        
    }
}

// best solution from the submission detail section

// 0ms ( 100% )

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int lengthOfLCIS = 0;
        int temp = 1;
        int length = nums.length;
        if (length < 2) {
            return length;
        }
        for (int i = 1 ; i < length; i++) {
            if (nums[i] > nums[i-1]) {
                temp++;
                if (temp > lengthOfLCIS) {
                    lengthOfLCIS = temp;
                }
            } else {
                temp = 1;
            }
        }
        return lengthOfLCIS == 0 ? 1 : lengthOfLCIS;
    }
}