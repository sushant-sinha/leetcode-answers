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

// best solution from the solution section
// 6ms ( 90.43% ) 226mb ( 9.66% )

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[]=new int[nums.length];
        int k=1;
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(nums[i]<0){
                arr[k]=nums[i];
                k=k+2;
                    
            }
            else{
                arr[j]=nums[i];
                j=j+2;
            }
        }
        return arr;
    }
}