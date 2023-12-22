class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int ans[][]=new int[nums.length/3][3];
        
        int index=0;
        
        for(int i=0; i<nums.length-2; i++){
            
            // check for all the combinations of 3 elements
            if(Math.abs(nums[i]-nums[i+1])<=k && Math.abs(nums[i+1]-nums[i+2])<=k && Math.abs(nums[i+2]-nums[i])<=k){
                ans[index][0]=nums[i];
                ans[index][1]=nums[i+1];
                ans[index][2]=nums[i+2];
                index++;
                i+=2;
            }
            
            else{
                return new int[][]{};
            }
            
        }
        
        return ans;
        
    }
    
}