// SUSHANT SINHA

// 9ms ( 27.92% ) 42.55mb ( 32.49% )

// Clueless!! Referred editorial for understanding the expansion and the conversion to the Island problem

class Solution {

    int[][] expanded;

    public int regionsBySlashes(String[] grid) {

        // create a new matrix with (n*3, n*3) dimension
        final int dim=grid.length*3;

        expanded=new int[grid.length*3][grid.length*3];

        int expandedI=0;

        for(int i=0;i<grid.length;i++){

            String subGrid=grid[i];

            int expandedJ=0;

            for(int j=0;j<subGrid.length();j++){

                if(subGrid.charAt(j)==' '){
                    // fill 0s

                    for(int x=3*expandedI; x<3*(expandedI+1); x++){
                        for(int y=3*expandedJ; y<3*(expandedJ+1); y++)
                            expanded[x][y]=0;
                    }
                }

                else if(subGrid.charAt(j)=='/'){
                    // fill /

                    for(int x=3*expandedI; x<3*(expandedI+1); x++){
                        // System.out.println();
                        for(int y=3*expandedJ; y<3*(expandedJ+1); y++)
                            expanded[x][y]= (x-3*expandedI + y-3*expandedJ)==2 ? 1 : 0;
                    }                  
                }

                else{
                    // fill \

                    for(int x=3*expandedI; x<3*(expandedI+1); x++){
                        for(int y=3*expandedJ; y<3*(expandedJ+1); y++)
                            expanded[x][y]= (x-3*expandedI) == (y-3*expandedJ) ? 1 : 0;
                    }

                    // no need for considering \\ as two different characters
                    // \\ is a single character which is visibly '\'
                    // j++;
                }

                expandedJ++;
            }

            expandedI++;
        }

        // for(int i[]: expanded){
        //     System.out.println(Arrays.toString(i));
        // }

        int ans=0;

        // start flood fill
        for(int i=0;i<expanded.length;i++){
            for(int j=0;j<expanded.length;j++){

                if(expanded[i][j]==0){
                    ans++;
                    floodFill(i, j, dim);
                }
            }
        }

        return ans;
        
    }

    void floodFill(int i, int j, int dim){

        if(i<0 || i>=dim || j<0 || j>=dim)
            return;

        if(expanded[i][j]==0){

            expanded[i][j]=1;
            
            floodFill(i+1, j, dim);
            floodFill(i, j+1, dim);
            floodFill(i-1, j, dim);
            floodFill(i, j-1, dim);

        }

        return;

    }
}