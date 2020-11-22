// SUSHANT SINHA
class Solution {
    public int removeElement(int[] nums, int val) {
        int ans[]=new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                ans[c++]=nums[i];
                //System.out.println(nums[i]);
            }
        }
        
        for(int i=0;i<c;i++){
            
            nums[i]=ans[i];
            System.out.println(ans[i]);
        }
        return c;
    }
}