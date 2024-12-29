

class Solution {

    int ans=Integer.MAX_VALUE;
    public int mincostTickets(int[] days, int[] costs) {

        recur(0, days, costs, 0);

        return ans;
        
    }

    void recur(int index, int[] days, int[] costs, int curSum){

        // System.out.println("iteration ---- "+index);

        if(index==days.length){
            // System.out.println(curSum);
            ans=Math.min(ans, curSum);
            return;
        }

        // one day pass
        recur(index+1, days, costs, curSum+costs[0]);

        // one week pass
        int lastDay=days[index]+7;
        int tempIndex=index;

        while(tempIndex<days.length && days[tempIndex]<lastDay)
            tempIndex++;
        
        recur(tempIndex, days, costs, curSum+costs[1]);

        // one month pass
        lastDay=days[index]+30;
        tempIndex=index;
        while(tempIndex<days.length && days[tempIndex]<lastDay)
            tempIndex++;
        
        recur(tempIndex, days, costs, curSum+costs[2]);

    }
}