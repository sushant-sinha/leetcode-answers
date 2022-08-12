// SUSHANT SINHA

// 1ms ( 75% ) 41.6mb ( 66.67% )

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        
        /*
        
        // brute force
        
        int ans=0;
        
        for(int i=0;i<nums.length-2;i++){
            
            for(int j=i+1;j<nums.length-1;j++){
                
                for(int k=j+1; k<nums.length;k++){
                    
                    if((nums[j] - nums[i] == diff) && (nums[k] - nums[j] == diff))
                        ans++;
                    
                }
                
            }
            
        }
        
        return ans;
        
        */
        
        // new method
        
        // this array is for marking the visited elements
        // also will be needed when we will be finding the other 2 elements (i and j)
        
        boolean seen[]=new boolean[201];
        
        int ans=0;
        
        for(int i: nums){
            
            if(i>=2*diff)
                ans += seen[i-diff] && seen[i-(2*diff)] ? 1 : 0;
            
            seen[i]=true;
            
        }
        
        return ans;
        
    }
}