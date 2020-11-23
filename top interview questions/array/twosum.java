// SUSHANT SINHA
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]={0,0};
        for(int i=0;i<(nums.length-1);i++){
//             if(nums[i]>target && nums[i+1]> 0 && target > 0)continue;
//             if(nums[i]<target && nums[i+1]<target && target <0)continue;
//             and other such conditions can be added to speed up the loops .... jumping the statements.
                for(int j=(i+1);j<nums.length;j++){
                    if(nums[i]+nums[j]==target){ans[0]=i;ans[1]=j;return ans;}
            
            }
        }
        return ans;
    }
}