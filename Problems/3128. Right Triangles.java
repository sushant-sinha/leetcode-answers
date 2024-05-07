// SUSHANT SINHA

// 16ms ( 66.67% ) 146.14mb ( 33.33% )

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

        // be careful with the return type.... int wont accomodate all the combinations
        long ans=0;

        for(int i=0;i<grid.length;i++){

            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]==1){

                    // a right angle can be formed with any 1 in the same row and col.
                    // they dont need to be adjacent. Therefore, any 1 can be paired with any 1 in the same rorw and col
                    // first example is misleading and makes you think that they have to be adjacent
                    // third example makes you think that wraparound is allowed😂
                    ans+=(rowOneCount[i]-1)*(colOneCount[j]-1);
                }
            }
        }

        return ans;
        
    }
}