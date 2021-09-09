class Solution {
    public int countQuadruplets(int[] nums) {
        
        int ans=0;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    for(int l=k+1;l<nums.length;l++)
                        ans+= nums[i]+nums[j]+nums[k]==nums[l] ? 1 : 0;
                }
            }
        }
        
        return ans;
        
    }
}