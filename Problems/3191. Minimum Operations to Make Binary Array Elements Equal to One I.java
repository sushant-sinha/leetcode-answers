// SUSHANT SINHA

// 6ms ( 99.99% ) 57.16mb ( 71.65% )

class Solution {
    public int minOperations(int[] nums) {

        int ans=0;

        for(int i=0;i<nums.length-2;i++){

            if(nums[i]==0){
                nums[i]=flip(nums[i]);
                nums[i+1]=flip(nums[i+1]);
                nums[i+2]=flip(nums[i+2]);
                ans++;
            }
        }

        // System.out.println(Arrays.toString(nums));

        if(nums[nums.length-1]==0 || nums[nums.length-2]==0){
            return -1;
        }

        return ans;
        
    }

    int flip(int i){

        return i==0 ? 1 : 0;
    }
}