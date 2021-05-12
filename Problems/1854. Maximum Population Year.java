// from discuss tab
// 1ms ( 88.92% ) 36.8mb ( 96.47% )

class Solution {
    public int maximumPopulation(int[][] logs) {
        
        int[] map = new int[101]; // Based on problem statement: 1950 <= birthi < deathi <= 2050, so we only need 101.
        
        for(int[] l : logs){
            for(int i = l[0]; i < l[1]; i++){
                map[i - 1950]++;
            }
        }
        
        int max = 0;
        int res = -1;
        
        for(int i = 0; i < 101; i++){
            if(map[i] > max){
                max = map[i];
                res = i + 1950;
            }
        }
        
        return res; 
    }
}