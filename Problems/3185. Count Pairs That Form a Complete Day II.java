// SUSHANT SINHA

// 4ms ( 85.31% ) 96.91mb ( 19.60% )

class Solution {
    public long countCompleteDayPairs(int[] hours) {

        int[] remainder=new int[24];

        long ans=0;

        for(int i:hours){

            int cur=i%24;
            int remainingHours=(24-cur)%24;

            ans+=(remainder[remainingHours]);

            remainder[i%24]++;
        }

        return ans;
        
    }
}