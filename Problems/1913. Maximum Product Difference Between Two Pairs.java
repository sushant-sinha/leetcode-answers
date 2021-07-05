// SUSHANT SINHA

// 6ms ( 79.06% ) 39.4mb ( 43.44% ) 
// no brain needed

class Solution {
    public int maxProductDifference(int[] nums) {
        
        Arrays.sort(nums);
        
        return ((nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]));
        
    }
}

// 2ms ( 92.18% ) 38.7mb ( 98.08% )
// faster solution

class Solution {
    public int maxProductDifference(int[] nums) {
        int low1 = nums[0], low2 = 10001, high1 = nums[0], high2 = -1;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>=high1)
            {
                high2 = high1;
                high1 = nums[i];
            }
            else if(nums[i]<high1 && nums[i]>high2)
            {
                high2 = nums[i];
            }
            
            if(nums[i]<=low1)
            {
                low2 = low1;
                low1 = nums[i];
            }
            else if(nums[i]>low1 && nums[i]<low2)
            {
                low2 = nums[i];
            }
        }
        
        return (high1*high2) - (low1*low2);
    }
}