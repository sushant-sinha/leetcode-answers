// SUSHANT SINHA

class Solution {
    public int[][] transpose(int[][] A) {
        int row = A.length, column = A[0].length;

        // could replace coulmn and row .... to decrease space

        int[][] ans = new int[column][row];
        for (int r = 0; r < row; ++r){
            for (int c = 0; c < column; ++c) {
                ans[c][r] = A[r][c];
            }
        }
        return ans;
    }
}