// SUSHANT SINHA

class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int zero=0, max=0;
        int start=0,end=1;
        
        // case if k is 0
        if(k==0){
            while(start!=nums.length){
                
                int temp=0;
                
                while(start<nums.length &&nums[start]==0){
                    start++;
                }
                
                while(start<nums.length && nums[start]==1){
                    temp++;
                    start++;
                }
                
                max = max > temp ? max : temp;
                                
                
            }
            
            return max;
        }
        
        if(nums[start]==0)
            zero++;
        else
            max++;
        
        while(end!=nums.length){
            
            while( end<nums.length && nums[end]==1){
                max = max > end-start ? max : end-start;
                //System.out.println("first"+" end "+end+" start "+start+" zero "+zero+" max "+max);
                end++;
                
            }
            
            if(end<nums.length && nums[end]==0 && zero<k){
                zero++;
                max = max > end-start ? max : end-start;
                //System.out.println("second"+" end "+end+" start "+start+" zero "+zero+" max "+max);
                
                end++;
                
                
            }
            
            else if(end<nums.length && nums[end]==0 && zero==k){
                while(nums[start]!=0){
                    start++;
                }
                start++;
                max = max > end-start ? max : end-start;
                end++;
                
                //System.out.println("third"+" end "+end+" start "+start+" zero "+zero+" max "+max);
                
            }
            
        }
        
        return max+1;
        
        
    }
}