// SUSHANT SINHA
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even[]=new int[nums.length];
        int ce=0,co=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)even[ce++]=nums[i];
            else even[nums.length-(++co)]=nums[i];
        }
        return even;
    }
}