// SUSHANT SINHA

// retry this, TLE even for a small array:
// days = [2,3,5,6,7,8,9,10,11,17,18,19,23,26,27,29,31,32,33,34,35,36,38,39,40,41,42,43,44,45,47,51,54,55,57,58,64,65,67,68,72,73,74,75,77,78,81,86,87,88,89,91,93,94,95,96,98,99]
// costs = [5,24,85]

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