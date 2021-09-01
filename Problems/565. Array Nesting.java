class Solution {
    public int arrayNesting(int[] nums) {
                
        boolean went[]=new boolean[nums.length];
        
        int max=0;
        
        for(int i=0;i<nums.length;i++){
            
            if(!went[i]){
                int count=0;
                
                while(!went[i]){
                    
                    went[i]=true;
                    count++;
                    i=nums[i];
                    
                }
                
                max= max>count ? max : count;
            }
        }
        
        return max;
        
    }
}