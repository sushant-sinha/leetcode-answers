// SUSHANT SINHA

// 2ms ( 74.54% ) 43.47mb ( 18.48% )

/*
could have used more memory efficient way of hashing:
    1) boolean array
    2) int array, as 1<=nums[i]<=50
*/

class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        HashSet<Integer> set=new HashSet<>();

        int ans=0;

        for(int i:nums){
            if(set.contains(i)){
                ans^=i;
            }
            set.add(i);
        }

        return ans;
        
    }
}