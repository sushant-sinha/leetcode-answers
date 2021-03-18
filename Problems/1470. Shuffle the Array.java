// SUSHANT SINHA

// 0ms ( 100% ) 38.8mb ( 92.38% )

class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int ans[]=new int[2*n];
        
        for(int i=0;i<n;i++){
            
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[n+i];
            
        }
        
        return ans;
        
    }
}