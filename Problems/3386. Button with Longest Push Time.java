class Solution {
    public int buttonWithLongestTime(int[][] events) {
        
        int ansIndex=events[0][0], timeDiff=events[0][1];

        for(int i=1;i<events.length;i++){
            
            int newTimeDiff=events[i][1]-events[i-1][1];

            if(newTimeDiff>timeDiff){
                ansIndex=events[i][0];
                timeDiff=newTimeDiff;
            }

            if(timeDiff==newTimeDiff)
                ansIndex=Math.min(ansIndex, events[i][0]);
        }

        return ansIndex;
        
    }
}