// SUSHANT SINHA

// 2ms ( 100% ) 39.8mb ( 100% )
// not enough accepted submissions

class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int ans[]=new int[2*nums.length];
        
        for(int i=0;i<ans.length;i++){
            
            ans[i]=nums[i%nums.length];
            
        }
        
        return ans;
        
    }
}