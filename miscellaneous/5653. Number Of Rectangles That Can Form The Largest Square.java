// SUSHANT SINHA


class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        
        int ans=0;
        int length[]=new int[rectangles.length];
        
        for(int i=0;i<rectangles.length;i++){
            
            Arrays.sort(rectangles[i]);
            length[i]=rectangles[i][0];
                
        }
        
        Arrays.sort(length);
        int max=length[rectangles.length-1];
        
        for(int i=rectangles.length-1;i>=0;i--){
            
            if(length[i]==max)ans++;
            else break;
            
        }
        
        return ans;
        
    }
}