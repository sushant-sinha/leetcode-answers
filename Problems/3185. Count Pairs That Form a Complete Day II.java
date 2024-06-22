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

        // System.out.println(Arrays.toString(remainder));


        return ans;
        
    }
}