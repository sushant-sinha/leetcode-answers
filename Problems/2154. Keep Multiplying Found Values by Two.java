// SUSHANT SINHA

// 2ms ( 87.13% ) 44.1mb ( 76.82% )

class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        int i=0;
        
        for(; i<nums.length ;i++){
            
            if(nums[i]==original){
                
                original*=2;
                i=-1;
                
            }
        }
        
        return original;
        
    }
}

// using arraylist (not needed actually)
// 2ms ( 87.13% ) 42mb ( 90.81% )

class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        ArrayList<Integer> temp=new ArrayList<>();
        
        for(int i:nums){
            
            temp.add(i);
            
        }
        
        while(temp.contains(original)){
            original*=2;
        }
        
        return original;
        
    }
}
