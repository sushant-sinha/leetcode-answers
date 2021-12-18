// SUSHANT SINHA

// 89ms ( 22.07% ) 28.9mb ( 88.28% )

class Solution {
    public int sumFourDivisors(int[] nums) {
        
        int ans=0;
        
        
        for(int i:nums){
            
            int divcount=0,tempsum=0;

            // finding divisors till i/2 gives tle.... so iterate till the square root

            for(int j=1;j<=Math.sqrt(i);j++){
                
                if(i%j==0){
                    
                    tempsum+=j;

                    // if j is the square root... we will get the same number two times.. so we need to use an if condition to recitify this situation
                    if(j*j!=i){
                        tempsum+=i/j;
                        divcount++;
                    }

                    divcount++;
                }
                
            }
            
            if(divcount==4)
                ans+=tempsum;
            
        }
        
        
        return ans;
        
    }
}