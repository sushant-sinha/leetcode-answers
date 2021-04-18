// SUSHANT SINHA

// 54ms ( 100% ) 47.7mb ( 100% )

class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        
        int ans[]=new int[queries.length];
        
        for(int i=0;i<queries.length;i++){
            
            for(int t[]:points){
                
                if(Math.sqrt(Math.pow(t[0]-queries[i][0],2) + Math.pow(t[1]-queries[i][1],2))<=queries[i][2])
                    ans[i]++;
                
            }
            
        }
        
        return ans;
        
    }
}