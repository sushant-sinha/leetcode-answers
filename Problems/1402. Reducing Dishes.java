// SUSHANT SINHA

// 3ms ( 54.38% ) 40.9mb ( 51.80% )

class Solution {
    public int maxSatisfaction(int[] satisfaction) {

        Arrays.sort(satisfaction);

        // System.out.println(satisfaction.length);

        int ans=0;

        for(int i=0;i<satisfaction.length;i++){

            int time=1, cur=0;

            for(int j=i;j<satisfaction.length;j++){
                cur+=(satisfaction[j]*time);
                time++;
            }

            // System.out.println(cur);

            if(cur>ans)
            ans=cur;
        }

        return ans;
        
    }
}