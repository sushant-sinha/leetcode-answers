// SUSHANT SINHA

// 8ms ( 72.13% ) 228.8mb ( 5.14% )

class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int pos[]=new int[nums.length/2];
        int neg[]=new int[nums.length/2];
        
        int posIndex=0, negIndex=0;
        
        for(int i:nums){
            
            if(i>0){
                pos[posIndex++]=i;
            }
            
            else{
                neg[negIndex++]=i;
            }
            
        }
        
        posIndex=0; negIndex=0;
        
        for(int i=0;i<nums.length;i++){
            
            nums[i]=pos[posIndex++];
            nums[++i]=neg[negIndex++];
            
        }

        // instead of the above for loop, could have used this
        
        /*
        for (int i =0; i < nums.length/2; i++) {
            nums[i * 2] = p[i];
            nums[(i * 2) + 1] = n[i];
        }
        */
        
        return nums;
        
    }
}