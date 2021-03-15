//  SUSHANT SINHA

/*

    We just need to find minimum value of sum at any level found...
    if the minimum sum is -8
    
    then we will make it -(-8)+1 as the answer

*/

class Solution {
    public int minStartValue(int[] nums) {        
        
        //to track sum of array elements
        int sum =0;
    
        //to check smallest sum of the array at any index
        int min =1 ;
        
        for(int i: nums)
        {   
            //total sum of array until i
            sum = sum + i;
            //check the minStepSum  sum of array until i
            min = min < sum ? min : sum;
            
  
        }

        /*
         if min  is less than 1
          ex if min sum is -3
          make it positive and add 1 so that any step by step sum will never be less than 1        
        */
        if(min<1)
        {
           return Math.abs(min) + 1; 
        }
        
        
        return 1;
    }
}
