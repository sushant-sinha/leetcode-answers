// SUSHANT SINHA

// 16ms ( 100% ) 68.8mb ( 100% )

class Solution {
    public int matrixSum(int[][] nums) {
        
        int ans=0;
        
        for(int i[]:nums)
            Arrays.sort(i);
        
        for(int i=nums[0].length-1;i>=0;i--){
            
            int tempMax=0;
            
            for(int j[]:nums)
                tempMax= tempMax>j[i] ? tempMax : j[i];
            
            ans+=tempMax;
        }
        
        return ans;
        
    }
}