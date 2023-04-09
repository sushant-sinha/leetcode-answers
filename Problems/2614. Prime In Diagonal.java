// SUSHANT SINHA

// 13ms ( 20% ) 51.3mb ( 100% )

class Solution {
    public int diagonalPrime(int[][] nums) {
        
        int ans=0, len=nums.length;
        
        for(int i=0;i<len;i++){
            
            int index=len-i-1;            
            
            if(nums[i][index]!=1 && isPrime(nums[i][index]))
                ans = ans < nums[i][index] ? nums[i][index]: ans;
            
            if(nums[i][i]!=1 && isPrime(nums[i][i]))
                ans = ans < nums[i][i] ? nums[i][i] : ans;
            
            // System.out.println("ans="+ans);

        }
        
        return ans;
    }
    
    boolean isPrime(int n){
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        
        return true;
        
    }
}