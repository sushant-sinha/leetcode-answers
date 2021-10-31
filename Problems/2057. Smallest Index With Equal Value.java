// SUSHANT SINHA

// 0ms ( 100% ) 39.3mb ( 66.67% )

class Solution {
    public int smallestEqual(int[] nums) {

        int i=0;
        
        while(i!=nums.length && i%10!=nums[i]){
            i++;
        }
        
        return i==nums.length ? -1 : i;

    }
}