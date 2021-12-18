class Solution {
    public int sumFourDivisors(int[] nums) {
        
        int ans=0;
        
        
        for(int i:nums){
            
            int divcount=0,tempsum=0;

            for(int j=1;j<=Math.sqrt(i);j++){
                
                if(i%j==0){

                    tempsum+=j;

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