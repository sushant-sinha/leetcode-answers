// SUSHANT SINHA

// 1ms ( 100% ) 55.50mb ( 74.60% )

class Solution {
    public int minOperations(int[] nums, int k) {
        
        int cur=nums[0];
        
        for(int i=1;i<nums.length;i++){
            
            cur^=nums[i];
            
        }
        
        // bits which are not same between the XOR and the target
        int diff=cur^k;
        
        // return the number of places where the bit is one (where the bits are different)
        return count(diff);
        
    }
    
    int count(int num){
        
        int count=0;
        
        while(num!=0){
            count+=num%2;
            num/=2;
        }
        
        return count;
        
    }
    
}