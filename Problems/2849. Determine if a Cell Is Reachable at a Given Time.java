// SUSHANT SINHA

// 1ms ( 95.45% ) 39.28mb ( 98.32% )

class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        
        // case when start and end are equal
        if(sx==fx && sy==fy){
            
            if(t==0 || t>1)
            return true;

            else
            return false;
        }
        
        int totalRoute=0;

        // travel diagonally and check which axis is met first
        // which coordinate aligns first (checked in line 24)
        // then calculate the distance along the other axis (done in the second half of the totalRoute calculation)
        // x reaches first
        if(Math.abs(sx-fx)<Math.abs(sy-fy)){
            
            int minRoute=Math.abs(sx-fx);
            
            totalRoute=minRoute+(Math.abs(fy-sy)-minRoute);
        
        }
        
        // y reaches first
        else{
            
            int minRoute=Math.abs(sy-fy);
            
            totalRoute=minRoute+(Math.abs(fx-sx)-minRoute);
            
        }
        
        if(totalRoute<=t)
            return true;
        
        return false;
        
    }
}