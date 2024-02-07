// SUSHANT SINHA

// 14ms ( 50% ) 44.46mb ( 50% )

class Solution {
    public int numberOfPairs(int[][] points) {
        
        int ans=0;
        
        for(int i=0;i<points.length;i++){
            
            for(int j=0;j<points.length;j++){
                
                if(j==i)
                    continue;
                
                // check if there are any other points in this rectable
                
                // System.out.println("for "+i+" & "+j+" validator is "+validator(points, i, j));
                if(validator(points, i, j))
                    ans++;
                
            }
        }
        
        return ans;
        
    }
    
    boolean validator(int[][] points, int topLeft, int bottomRight){
        
        int topLeftX=points[topLeft][0];
        int topLeftY=points[topLeft][1];
        int bottomRightX=points[bottomRight][0];
        int bottomRightY=points[bottomRight][1];
        
        // check for valid rectangle
        
        if(topLeftX>bottomRightX || topLeftY<bottomRightY)
            return false;
        
        for(int i=0;i<points.length;i++){
            
            if(i==topLeft || i==bottomRight)
                continue;
            
            if(points[i][0]>=topLeftX && points[i][0]<=bottomRightX){
                if(points[i][1]<=topLeftY && points[i][1]>=bottomRightY)
                    return false;
            }
            
        }
        
        return true;
    }
}