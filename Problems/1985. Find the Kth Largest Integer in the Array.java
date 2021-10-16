// SUSHANT SINHA
// 153ms ( 23.69% ) 98.6mb ( 7.75% )

// PriorityQueue is used

import java.math.BigInteger;

class Solution {
    
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> pq = new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++){
            
            pq.add(convertToInt(nums[i]));
            
            if(pq.size() > k)
                pq.remove();
        }
        
        return pq.peek().toString();
    }
    
    public BigInteger convertToInt(String s){
        return new BigInteger(s);
    }
}