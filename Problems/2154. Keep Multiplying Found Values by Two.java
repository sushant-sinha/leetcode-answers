// SUSHANT SINHA

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