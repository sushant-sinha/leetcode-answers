// SUSHANT SINHA

// 16ms ( 27.37% ) 44.2mb ( 100% )

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> ans=new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]==nums[i+1]){
                ans.add(nums[i]);
                i++;
            }
            
        }
        
        System.gc();
        
        return ans;
        
    }
}