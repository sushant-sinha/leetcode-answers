// SUSHANT SINHA

// 72ms ( 81.45% ) 45.07mb ( 60.06% )

public class Solution {
    public bool IsArraySpecial(int[] nums) {

        for(int i=0;i<nums.Length-1;i++){
            if(i+1<nums.Length){
                if(nums[i]%2==nums[i+1]%2)
                    return false;
            }
        }

        return true;
        
    }
}