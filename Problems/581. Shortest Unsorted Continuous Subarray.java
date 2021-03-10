// SUSHANT SINHA

// 6ms( 48.34% ) 40mb ( 83.14% )

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        if(nums.length==1)return 0;
        
        int start=0,end=0;
        int sorted[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
            sorted[i]=nums[i];
        
        Arrays.sort(sorted);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=sorted[i]){
                start=i;
                break;
            }
        }
        
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=sorted[i]){
                end=i;
                break;
            }
        }
        if(end==start)return 0;
        return end-start+1;
        
    }
}