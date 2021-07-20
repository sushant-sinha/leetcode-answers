class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int ans[]=new int[nums.length];
        
        int e=-1,o=-1;
        
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                while(++e<nums.length && nums[e]%2!=0){}
                
                ans[i]=nums[e];
            }
            
            else{
                while(++o<nums.length && nums[o]%2==0){}
                
                ans[i]=nums[o];
            }
            
        }
        
        return ans;
        
    }
}