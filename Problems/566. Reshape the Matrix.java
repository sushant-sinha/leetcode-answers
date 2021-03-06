// SUSHANT SINHA

// 0ms ( 100% ) 39.9mb ( 53.43% )

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if((mat.length*mat[0].length)!=r*c)
            return mat;
        
        int ans[][]=new int[r][c];

        r=0;c=-1;
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                
                ans[r][++c]=mat[i][j];

                if(c==ans[0].length-1){
                    r++;
                    c=-1;
                }
            }
        }
        
        return ans;
        
    }
}

// or can use ArrayList for easy implementation
// 2ms ( 20.24% )

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if((mat.length*mat[0].length)!=r*c)
            return mat;
        
        int ans[][]=new int[r][c];

        ArrayList<Integer> store = new ArrayList<>();
        
        for(int i[]:mat)
            for(int j:i)
                store.add(j);

        r=0;c=-1;

        for(int i:store){

            ans[r][++c]=i;

                if(c==ans[0].length-1){
                    r++;
                    c=-1;
                }

        }

        return ans;
        
    }
}