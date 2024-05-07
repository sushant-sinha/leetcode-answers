class Solution {
    public long numberOfRightTriangles(int[][] grid) {

        int rowOneCount[]=new int[grid.length];
        int colOneCount[]=new int[grid[0].length];

        for(int i=0;i<grid.length;i++){

            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    rowOneCount[i]++;
                    colOneCount[j]++;
                }
            }
        }

        long ans=0;

        for(int i=0;i<grid.length;i++){

            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]==1){
                    ans+=(rowOneCount[i]-1)*(colOneCount[j]-1);
                }
            }
        }

        return ans;
        
    }
}