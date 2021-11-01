// SUSHANT SINHA

// 0ms ( 100% ) 38.9mb ( 66.67% )

class Solution {
    public int smallestEqual(int[] nums) {

/*

        if asked to implement without using mod and are allowed to use division
        we can:

        for(int i=0;i<nums.length;i++)
            if(i-((i/10)*10)==nums[i])
                return i;
        
        return -1;

        if even division is not allowed


        https://leetcode.com/problems/smallest-index-with-equal-value/discuss/1550381/Java-solution-without-using-mod

        public int smallestEqual(int[] a) {
            for (int d1 = 0; d1 <= 9; d1++)
                for (int d2 = 0; d2 <= 9 && 10 * d1 + d2 < a.length; d2++)
                    if (d2 == a[d1 * 10 + d2])
                        return d1 * 10 + d2;
            return -1;

        }
*/
        
        int i=0;
        
        while(i!=nums.length && i%10!=nums[i]){
            i++;
        }
        
        return i==nums.length ? -1 : i;

/*
        or can use for loop instead of while

        for(int i=0;i<nums.length;i++)
            if(i%10==nums[i])
                return i;
        
        return -1;
*/

    }
}