// SUSHANT SINHA

// 13ms ( 79.14% ) 47.5mb ( 73.45% )

class Solution {
    public int[][] kClosest(int[][] points, int K) {
        
        double ar[]=new double[points.length];
        
        for(int i=0;i<points.length;i++){
            
            ar[i] = Math.sqrt((points[i][0]*points[i][0])+(points[i][1]*points[i][1]));
            
        }
        
        Arrays.sort(ar);
        double dk=ar[K-1];
        int ans[][] = new int[K][2];
        int pointer=0;
        
        for(int i=0;i<points.length;i++){
            
            if( Math.sqrt((points[i][0]*points[i][0])+(points[i][1]*points[i][1])) <= dk)
                ans[pointer++]=points[i];
                        
        }
        
        return ans;
        
    }
    
}