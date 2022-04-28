class Solution {
    public int findClosestNumber(int[] nums) {
        
        // 2 values to be stored: i) the number itself and ii) the distance from 0
        int ans[]=new int[2];
        ans[1]=1000000;
        
        Arrays.sort(nums);
        int i=nums.length-1;
        
        int distance;
        
        while(i>=0){
            
            distance=nums[i]>0 ? nums[i] : nums[i]*(-1);
            //System.out.println("new dist"+distance+" old dist"+ans[1]);

            
            if(distance<ans[1]){
                
                ans[0]=nums[i];
                ans[1]=distance;
                
            }
            
            else if(distance==ans[1] && nums[i]==ans[0]){
                --i;
                continue;
            }
            
            else
                break;
            
            --i;
            
        }
        
        return ans[0];
        
    }
}