class Solution {
    public int minimumDeletions(int[] nums) {
        
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        
        int minindex=0,maxindex=0;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>max){
                max=nums[i];
                maxindex=i;
            }
            
            if(nums[i]<min){
                min=nums[i];
                minindex=i;
            }
        }
        
        // case 1
        // delete from left
        int ans = Math.max(minindex, maxindex) + 1;
        
        //case 2
        // delete from right
        ans = Math.min(ans, Math.max(nums.length - minindex, nums.length - maxindex));
        
		// edges
        int left  = Math.min(minindex, maxindex);  
        int right = Math.max(minindex, maxindex);
        
        //case 3
        // delete from left and right
        ans = Math.min(ans, left + 1 + nums.length - right);
        
        return ans;
    }
}