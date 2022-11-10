class Solution {
    public int averageValue(int[] nums) {
        
        int count=0, sum=0;
        
        for(int i:nums){
            
            if(i%6==0){
                count++;
                sum+=i;
            }
            
        }
        
        if(count==0)
            return 0;
        
        else
            return sum/count;
        
    }
}