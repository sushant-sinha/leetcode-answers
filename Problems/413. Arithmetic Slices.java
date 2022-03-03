class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        /*
        
        prevAP is for the number of previous continuous Arithmetic Progression,
        for e.g. :
        [1,2,3,4] will have 2 continuos APs,
        so the prevAP will be 1 for the first iteration (1,2,3) ,
        then, in (2,3,4), the prevAP value will be incremented to=2, because there are 2 continuos 2 APs till now
        the final answer will be the sum of 1+2 as there exists another array which contains these 2 interleaved (2 and 3 are common in both the arrays) subarrays. Which is (1,2,3,4). so the total value is 3-> return
        
        */
        
        int ans=0, prevAP=0;
        
        // for triplets
        
        for(int i=0;i<nums.length-2;i++){
            
            if(nums[i]-nums[i+1]==nums[i+1]-nums[i+2]){
                
                prevAP++;
                ans+=prevAP;
            }
            
            else
                prevAP=0;
            
        }
        
        return ans;
        
    }
}