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