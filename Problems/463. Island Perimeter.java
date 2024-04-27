// SUSHANT SINHA

// 20ms ( 5.37% ) 45.21mb( 85.54% )

class Solution {

    HashSet<Integer> seen = new HashSet<>();
    int[][] map;

    int perimeter=0;

    public int islandPerimeter(int[][] grid) {

        map=grid;

        for(int i=0;i<grid.length;i++){
            
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]==1){

                    traverse(i, j, grid.length, grid[0].length);
                    break;
                }
            }
        }

        
        return perimeter;    
    }

    void traverse(int i, int j, int m, int n){

        // using a custom operator to always get unique values for the coordinates/indices
        seen.add((i*100000)+j);
        map[i][j]=0;

        // check all 4 directions

        if((i-1)>=0){

            // if this is not a seen land
            if(!seen.contains(((i-1)*100000)+j)){
                if(map[i-1][j]==0){
                    perimeter++;
                }

                else{
                    traverse(i-1,j,m,n);
                }
            }
        }

        else{
            perimeter++;
        }

        if(i+1<m){

            // if this is not a seen land
            if(!seen.contains(((i+1)*100000)+j)){
                if(map[i+1][j]==0){
                    perimeter++;
                }

                else{
                    traverse(i+1,j,m,n);
                }
            }
        }

        else{
            perimeter++;
        }

        if(j-1>=0){

            // if this is not a seen land
            if(!seen.contains((i*100000)+j-1)){
                if(map[i][j-1]==0){
                    perimeter++;
                }

                else{
                    traverse(i,j-1,m,n);
                }
            }
        }

        else{
            perimeter++;
        }

        if(j+1<n){

            // if this is not a seen land
            if(!seen.contains((i*100000)+j+1)){
                if(map[i][j+1]==0){
                    perimeter++;
                }

                else{
                    traverse(i,j+1,m,n);
                }
            }
        }

        else{
            perimeter++;
        }

    }
}