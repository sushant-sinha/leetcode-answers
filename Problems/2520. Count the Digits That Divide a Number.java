// SUSHANT SINHA

// 0ms ( 100% ) 40.8mb ( 14.97% )

class Solution {
    public int countDigits(int num) {
        
        int ans=0, div=num;
        
        while(div!=0){
            
            if(num%(div%10)==0)
                ans++;
            
            div=div/10;
            
        }
        
        return ans;
        
    }
}