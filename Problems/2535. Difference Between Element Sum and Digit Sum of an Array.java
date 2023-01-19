// SUSHANT SINHA

// no brainer
// 2ms ( 99.91% ) 42.1mb ( 92.14% )

class Solution {
    public int differenceOfSum(int[] nums) {
        
        int sum=0, charSum=0;
        
        for(int i: nums){
            
            sum+=i;
            charSum+=charSumHelper(i);
            
        }
        
        return Math.abs(sum-charSum);
        
    }
    
    int charSumHelper(int i){
        
        int sum=0;
        
        while(i!=0){
            sum+=i%10;
            i/=10;
        }
        
        return sum;
        
    }
    
}