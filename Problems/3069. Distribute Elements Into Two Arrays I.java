// SUSHANT SINHA

// 1ms ( 99.90% ) 44.78mb ( 35.13% )

class Solution {
    public int[] resultArray(int[] nums) {
        
        ArrayList<Integer> ar1=new ArrayList<>();
        ArrayList<Integer> ar2=new ArrayList<>();
        
        ar1.add(nums[0]);
        ar2.add(nums[1]);
        
        int ar1Last = nums[0];
        int ar2Last = nums[1];
        
        for(int i=2; i<nums.length;i++){
            
            if(ar1Last>ar2Last){
                ar1.add(nums[i]);
                ar1Last=nums[i];
            }
            
            else{
                ar2Last=nums[i];
                ar2.add(nums[i]);
            }
            
        }
        
        int index=0;
        
        for(int i:ar1){
            nums[index]=i;
            index++;
        }
        
        for(int i:ar2){
            nums[index]=i;
            index++;
        }
        
        return nums;
        
    }
}