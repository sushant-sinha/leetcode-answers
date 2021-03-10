// SUSHANT SINHA

// my solution .... slow

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int b:nums){
                if(b<nums[i])ans[i]++;
            }
        }
        
        return ans;
        
    }
}

// fastest solution

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        /*      
        nums = [8,1,2,2,3]
                
                0 1 2 3 4 5 6 7 8 9 ...101
        temp = [0 1 2 1 0 0 0 0 1........ ]
        ->     [0 1 ]
        */
        int[] temp = new int[101];
        for(int i = 0; i<nums.length; i++){
            temp[nums[i]]++;
        }
        
        for(int i =1; i<101; i++){
            temp[i] = temp[i]+temp[i-1];
        }
        
        for(int i = 0; i<nums.length; i++){
            int index = nums[i];
            if(index==0){
                nums[i] =0;
            }else{
                nums[i] = temp[index-1];
            }
           
        }
        
        return nums;
    }
}