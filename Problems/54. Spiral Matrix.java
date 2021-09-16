class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        int mincol = 0;
        int minrow = 0;
        int maxcol = matrix[0].length-1;
        int maxrow = matrix.length-1;
        int totalElement = (maxrow+1)*(maxcol+1);
//        System.out.println(totalElement);
        
        while(list.size()<totalElement){ 
            // right
            for(int j=mincol, i=minrow;j<=maxcol && list.size()<totalElement;j++){
                list.add(matrix[i][j]);
            }
            minrow++;
            
            // bottom
            for(int i=minrow, j=maxcol; i<=maxrow && list.size()<totalElement;i++){
                list.add(matrix[i][j]);
            }
            maxcol--;
            
            // left
            for(int j=maxcol, i=maxrow; j>=mincol && list.size()<totalElement; j--){
                list.add(matrix[i][j]);   
            }
            
            maxrow--;
            
            // top
            
            for(int i=maxrow, j=mincol;i>=minrow && list.size()<totalElement;i--){
                list.add(matrix[i][j]);
            }
            
            mincol++;
        }
        //System.out.println(list.size());
        return list;
    }
}