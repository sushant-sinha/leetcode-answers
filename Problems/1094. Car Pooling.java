// SUSHANT SINHA

// 2ms ( 74.98% ) 41.2mb ( 23.55%)

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {        
        
        int passcount[]=new int[1001];
        
        for(int i[]:trips){
            
            passcount[i[1]] += i[0];
            passcount[i[2]] -= i[0];
            
        }
        
        int curpass=0;
        
        for(int i:passcount){
            
            curpass+=i;
            
            if(curpass>capacity)
                return false;
            
        }
        
        return true;
        
    }
}
