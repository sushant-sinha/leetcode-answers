class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {

        int rowCount=mat.length, colCount=mat[0].length;

        int[] row=new int[rowCount];

        int[] col=new int[colCount];

        HashMap<Integer, int[]> pos=new HashMap<>();

        for(int i=0;i<rowCount;i++){

            for(int j=0;j<colCount;j++){
                
                pos.put(mat[i][j], new int[]{i,j});
                col[j]=rowCount;
            }

            row[i]=colCount;
        }

        // System.out.println(Arrays.toString(row));
        // System.out.println(Arrays.toString(col));

        for(int i=0;i<arr.length;i++){

            int[] positionInGrid=pos.get(arr[i]);

            // remove this element from the row
            row[positionInGrid[0]]--;

            if(row[positionInGrid[0]]==0)
                return i;

            // remove this element from the col
            col[positionInGrid[1]]--;

            if(col[positionInGrid[1]]==0)
                return i;
        }

        return 0;
        
    }
}