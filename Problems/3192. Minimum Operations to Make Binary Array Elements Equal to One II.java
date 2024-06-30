class Solution {
    public int minOperations(int[] nums) {

        int flipCounter=0;

        for(int i=0;i<nums.length;i++){

            
            if((nums[i]+flipCounter)%2==1)
                continue;
                
            else
                flipCounter++;
            
        }

        return flipCounter;
        
    }
}