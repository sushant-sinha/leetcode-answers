class Solution {
    public boolean checkValidGrid(int[][] grid) {

        if(grid[0][0]!=0)
            return false;

        return helper(grid, 0, 0, 1, grid.length);
        
    }

    boolean helper(int grid[][], int x, int y, int find, int len){

        // System.out.println("x="+x+" y="+y+" find="+find);

        if(grid[x][y]==(len*len)-1)
            return true;

        // condition for top left
        if((x-2)>=0 && (y-1)>=0 && (grid[x-2][y-1])==find)
            return helper(grid, x-2, y-1, find+1, len);

        // condition for top right
        if((x-2)>=0 && (y+1)<len && (grid[x-2][y+1])==find)
            return helper(grid, x-2, y+1, find+1, len);

        // condition for bottom left
        if((x+2)<len && (y-1)>=0 && (grid[x+2][y-1])==find)
            return helper(grid, x+2, y-1, find+1, len);

        // condition for bottom right
        if((x+2)<len && (y+1)<len && (grid[x+2][y+1])==find)
            return helper(grid, x+2, y+1, find+1, len);

        // condition for left top
        if((x-1)>=0 && (y-2)>=0 && (grid[x-1][y-2])==find)
            return helper(grid, x-1, y-2, find+1, len);

        // condition for left bottom
        if((x+1)<len && (y-2)>=0 && (grid[x+1][y-2])==find)
            return helper(grid, x+1, y-2, find+1, len);

        // condition for right top
        if((x-1)>=0 && (y+2)<len && (grid[x-1][y+2])==find)
            return helper(grid, x-1, y+2, find+1, len);

        // condition for right bottom
        if((x+1)<len && (y+2)<len && (grid[x+1][y+2])==find)
            return helper(grid, x+1, y+2, find+1, len);

        return false;

    }
}