// SUSHANT SINHA

// CHOOSE ANY ONE ;)

class Solution {
    public int missingNumber(int[] nums) {
        
        //USING ARRAYLIST
        
        // ArrayList<Integer> arr=new ArrayList<Integer>();
        // for(int i=0;i<nums.length;i++){
        //     arr.add(nums[i]);
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(!arr.contains(i))return i;
        // }
        // return nums.length;
        
        // USING SUM FASTEST
        
        int ans=0;
        for(int i=0;i<nums.length;i++)ans+=nums[i];
        return ((nums.length)*(nums.length+1)/2)-ans;
        
        // SORTING
        
        // Arrays.sort(nums);
        
        // for(int i=0;i<nums.length;i++){
        // if(nums[i]!=i)return i;
        // }
        // return nums.length;
        
    }
}