// SUSHANT SINHA

// last solution has the best runtime

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

// recursion
// 1ms ( 96.99% ) 44.5mb ( 62.39% )

class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == original) {
                return findFinalValue(nums, original*2);
            }
        }
        return original;
    }
}