// SUSHANT SINHA

// basic approach...
// 1ms ( 85.71% ) 39.1mb ( 42.86% )

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> ans=new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++)
            if(nums[i]==target)
                ans.add(i);
        
        return ans;
                
        
    }
}

// (should have used my brain previously😅 )
// since the array is sorted... we should stop when a number greater than target is found

// 1ms ( 85.71% ) 38.6mb ( 100% )

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> ans=new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                ans.add(i);
            
            else if(nums[i]>target)
                break;
            
        }
        
        return ans;
                
        
    }
}

// best solution from the submission tab
// 0ms ( 100% ) 38.8mb ( 100% )

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        
        int tCount = 0;
        int start = 0;
        
        for (int num : nums){
            if (num == target)
                ++tCount;
            else if (num < target)
                ++start;
        }
        
        while (tCount-- > 0){
            result.add(start++);
        }
        
        return result;
    }
}