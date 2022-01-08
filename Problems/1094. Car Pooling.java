// SUSHANT SINHA

// 2ms ( 74.98% ) 41.2mb ( 23.55%)

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {        
        
        // storing the passenger count for every stop ( pickup and drop location ) throughout the length of the trip
        int passcount[]=new int[1001];
        
        for(int i[]:trips){
            
            passcount[i[1]] += i[0];
            passcount[i[2]] -= i[0];
            
        }
        
        int curpass=0;
        
        for(int i:passcount){
            
            // adding passcount...
            // which can be +ve if the someone is being picked up
            // and -ve if someone is being dropped at his destination
            curpass+=i;
            
            // if the current passenger count exceeds the capacity... this means we have to return false
            if(curpass>capacity)
                return false;
            
        }
        
        return true;
        
    }
}

// best solution from the submissions section
// 0ms ( 100% ) 39mb ( 36.18% )

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int len = 0;
        int[] arr = new int[1001];
        for(int i = 0;i < trips.length;i++){
            int st = trips[i][1];
             int end = trips[i][2];
            int pass = trips[i][0];
            arr[st] += pass;
            arr[end] -= pass;
            len = Math.max(len, end);
        }
        int prefix = 0;
        for(int i = 0;i < len;i++){
            prefix += arr[i];
            
            if(prefix > capacity) return false;
        }
        return true;
    }
}