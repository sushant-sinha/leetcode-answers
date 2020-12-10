// SUSHANT SINHA

class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        double data[]=new double[6];
        // find length of all sides including diagonals
        data[0]=Math.sqrt(Math.pow((p1[0]-p3[0]),2)+Math.pow((p1[1]-p3[1]),2));
        data[1]=Math.sqrt(Math.pow((p2[0]-p4[0]),2)+Math.pow((p2[1]-p4[1]),2));
        data[2]=Math.sqrt(Math.pow((p1[0]-p2[0]),2)+Math.pow((p1[1]-p2[1]),2));
        data[3]=Math.sqrt(Math.pow((p2[0]-p3[0]),2)+Math.pow((p2[1]-p3[1]),2));
        data[4]=Math.sqrt(Math.pow((p3[0]-p4[0]),2)+Math.pow((p3[1]-p4[1]),2));
        data[5]=Math.sqrt(Math.pow((p1[0]-p4[0]),2)+Math.pow((p1[1]-p4[1]),2));
        
        Arrays.sort(data);
        
        // After sorting, we expect first 4 to be equal and last two be equal
        
        if(data[0]==data[1] && data[1]==data[2]&& data[2]==data[3]&& data[4]==data[5] && data[0]!=0)return true;
        
        else return false;
    }
}