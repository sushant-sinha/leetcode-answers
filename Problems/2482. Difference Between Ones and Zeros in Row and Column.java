class Solution {
    public int[][] onesMinusZeros(int[][] grid) {

        int rowCount=grid.length;
        int colCount=grid[0].length;

        int ans[][] = new int[rowCount][colCount];

        int row1Count[]=new int[rowCount];
        int col1Count[]=new int[colCount];

        // storing the values before

        for(int i=0; i<rowCount; i++){
            int row[]=grid[i];

            int tempCounter=0;

            for(int j: row)
                tempCounter+=j;

            row1Count[i]=tempCounter;
        }

        for(int i=0; i<colCount; i++){

            int tempCounter=0;

            for(int j=0;j<rowCount;j++)
                tempCounter+=grid[j][i];

            col1Count[i]=tempCounter;
        }

        // System.out.println(Arrays.toString(row1Count));
        // System.out.println(Arrays.toString(col1Count));

        for(int i=0;i<rowCount;i++){

            for(int j=0;j<colCount;j++){

                ans[i][j]=2*row1Count[i]+2*col1Count[j]-rowCount-colCount;

            }
        }

        return ans;
        
    }
}