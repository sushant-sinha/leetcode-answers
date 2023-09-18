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
        
        // case 1: finish is above start
        
        // if(sy<=fy){
            
            // which is first to reach? x or y
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
        // }
        
        // when finish is strictly below start
        // else{
            
            // which is first to reach? x or y
            // x reaches first
            // if(Math.abs(sx-fx)<Math.abs(sy-fy)){
                
            //     int minRoute=Math.abs(sx-fx);
                
            //     totalRoute=minRoute+(Math.abs(fy-sy)-minRoute);
                
            // }
            
            // // y reaches first
            // else{
                
            //     int minRoute=Math.abs(sy-fy);
                
                
            //     totalRoute=minRoute+(Math.abs(fx-sx)-minRoute);
                
            // }
        // }
        
        if(totalRoute<=t)
            return true;
        
        return false;
        
    }
}