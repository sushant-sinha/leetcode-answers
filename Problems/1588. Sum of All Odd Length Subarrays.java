// SUSHANT SINHA

// 2ms ( 47.28% ) 36.4mb ( 89.12% )

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int ans=0;
        
        for(int x:arr)
            ans+=x;
        
        for(int i=0;i<arr.length-2;i++){
            
            for(int j=i+2;j<arr.length;j+=2){
                
                for(int k=i;k<=j;k++)
                    ans+=arr[k];
                
            }
        }
        
        return ans;
     
    }
}