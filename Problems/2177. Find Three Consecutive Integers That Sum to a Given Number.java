// SUSHANT SINHA

// 1ms ( 40.00% ) 42.4mb ( 20.00% )

class Solution {
    public long[] sumOfThree(long num) {
        
        if(num%3==0){
            long ans[]=new long[3];
            
            return new long[]{(num/3)-1,num/3,(num/3)+1};
            
        }
        
        else
            return new long[]{};
        
    }
}