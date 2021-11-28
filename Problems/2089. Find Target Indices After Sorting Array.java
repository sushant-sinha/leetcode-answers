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