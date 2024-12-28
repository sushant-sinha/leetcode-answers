class Solution {

    public int maxScoreSightseeingPair(int[] values) {

        int len=values.length;
        int[] jVals=new int[len];

        jVals[len-1]=values[len-1]-(len-1);

        for(int i=values.length-2;i>=0;i--){
            jVals[i]=Math.max(jVals[i+1], values[i]-i);
        }

        // System.out.println(Arrays.toString(jVals));

        int ans=Integer.MIN_VALUE;

        for(int i=0;i<values.length-1;i++){
            ans=Math.max(ans, values[i]+i+jVals[i+1]);
        }

        return ans;
        
    }
}