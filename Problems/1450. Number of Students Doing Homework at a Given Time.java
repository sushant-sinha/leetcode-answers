// SUSHANT SINHA

// 0 ms solution

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        
        int ans=0;
        
        for(int i=0;i<startTime.length;i++){
            
            if(startTime[i] <= queryTime && endTime[i] >= queryTime)ans++;
            
        }
        
        return ans;
        
    }
}