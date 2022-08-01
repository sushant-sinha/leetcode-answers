class Solution {
    public int minimumOperations(int[] nums) {
        
        int ans=0;
        
        Arrays.sort(nums);
        
        int i=0;
        
        // this is for skipping all the leading zeroes in the array
        
        while(i<nums.length && nums[i]==0)
            i++;
        
        for(;i<nums.length;){
            
            int n=nums[i];
            
            while(i<nums.length && nums[i]==n){
                i++;
            }
            
            ans++;
            
        }
        
        return ans;
        
    }
}