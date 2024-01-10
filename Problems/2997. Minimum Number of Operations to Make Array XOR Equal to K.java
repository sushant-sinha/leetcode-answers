class Solution {
    public int minOperations(int[] nums, int k) {
        
        int cur=nums[0];
        
        for(int i=1;i<nums.length;i++){
            
            cur^=nums[i];
            
        }
        
        int diff=cur^k;
        
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