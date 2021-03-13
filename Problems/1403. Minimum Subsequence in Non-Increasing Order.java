// SUSHANT SINHA

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        
        Arrays.sort(nums);
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        if(nums.length==1){
            ans.add(nums[0]);
            return ans;
        }
        
        int sum=0;
        
        for(int i=0;i<nums.length;i++)sum+=nums[i];
        
        int cursum=0;
        
        for(int i=nums.length-1;i>=0;i--){
            
            sum-=nums[i];
            cursum+=nums[i];
            ans.add(nums[i]);
            if(cursum==sum){
                continue;
            }
            
            if(!(cursum<sum))
                return ans;           
            
        }
        
        return ans;
        
    }
}