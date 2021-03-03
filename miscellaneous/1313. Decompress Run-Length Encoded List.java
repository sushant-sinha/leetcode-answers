// SUSHANT SINHA

class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        ArrayList<Integer> temp=new ArrayList<>();
        
        for(int i=0;i<nums.length-1;i++){
            
            for(int j=0;j<nums[i];j++)
                temp.add(nums[i+1]);
            ++i;
            
        }
        
        int ans[]=new int[temp.size()];
        
        for(int i=0;i<temp.size();i++)
            ans[i]=temp.get(i);
        
        return ans;
        
    }
}