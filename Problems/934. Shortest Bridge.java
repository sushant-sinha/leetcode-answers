// SUSHANT SINHA

// 1117ms ( 5.8% ) 44.1mb ( 5.97% )
// check the editorial for better solution

/*

More practice!

286. Walls and Gates
417. Pacific Atlantic Water Flow <-- the best!!!
994. Rotting Oranges
1162. As Far from Land as Possible
1765. Map of Highest Peak

*/


// new idea: just find one island
//           then traverse the entire matrix to find all the manhattan distances from grid[i][j]==1

class Solution {

    HashSet<int[]> i1=new HashSet<>();
    HashSet<int[]> i2=new HashSet<>();

    public int shortestBridge(int[][] grid) {

        // find all the coordinates of the first island
        // find all the coordinates of the second island
        // find the minimum distance between any two island components

        boolean flag=true;

        for(int i=0;i<grid.length;i++){

            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    helper(i, j, grid, flag);
                    flag=false;
                }
                // else if(grid[i][j]==1 && !flag){
                //     helper(i, j, grid, flag);
                // }
            }
        }

        // System.out.println("for 1");
        // for(int i[]:i1)
        // System.out.println(i[0]+" "+i[1]);
        
        // System.out.println("for 2");
        // for(int i[]:i2)
        // System.out.println(i[0]+" "+i[1]);

        int ans=Integer.MAX_VALUE, dist=0;

        for(int i[]:i1){
            for(int j[]:i2){
                dist=Math.abs(i[0]-j[0])+Math.abs(i[1]-j[1]);
                ans = ans < dist ? ans : dist;
            }
        }

        return ans-1;
    }

    void helper(int i, int j, int[][] grid, boolean flag){

        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0)
        return;

        if(flag){
            i1.add(new int[]{i,j});
            grid[i][j]=0;
        }

        else{
            i2.add(new int[]{i,j});
            grid[i][j]=0;
        }

        helper(i+1, j, grid, flag);
        helper(i-1, j, grid, flag);
        helper(i, j+1, grid, flag);
        helper(i, j-1, grid, flag);

    }
}