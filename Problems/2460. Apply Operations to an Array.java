// SUSHANT SINHA

// 1ms ( 66.67% ) 42.4mb ( 66.67% )

class Solution {
    public int[] applyOperations(int[] nums) {
        
        ArrayList<Integer> pos=new ArrayList<>();
        
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]==nums[i+1]){
                
                if(nums[i]*2!=0){
                    nums[i]*=2;
                    pos.add(nums[i]);
                }
                
                nums[i+1]=0;
                
            }
            
            else{
                if(nums[i]!=0)
                    pos.add(nums[i]);
            }
            
        }
        
        if(nums[nums.length-1]!=0)
            pos.add(nums[nums.length-1]);
        
        int index=0;
        
        for(int i:pos){
            nums[index++]=i;
        }
        
        while(index<nums.length)
            nums[index++]=0;
        
        
        return nums;
        
    }
}