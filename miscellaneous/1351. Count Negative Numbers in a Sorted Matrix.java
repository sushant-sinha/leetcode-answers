// SUSHANT SINHA

// my solution

class Solution {
    public int countNegatives(int[][] grid) {
              
        int ans=0;
        for(int[] a:grid){
            for(int b:a){
                if(b<0)ans++;
            }
        }
        return ans;
    }
}
