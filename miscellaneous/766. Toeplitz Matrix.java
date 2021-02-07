// SUSHANT SINHA

// 0ms 39.2mb ( 57.04% )

class Solution {

  public boolean isToeplitzMatrix(int[][] matrix) {
      
    int x = 1, y = 1;
    while (x < matrix.length) {
      while (y < matrix[0].length) {
        if (matrix[x - 1][y - 1] != matrix[x][y]) {
          return false;
        }
        y++;
      }
      x++;
      y = 1;
    }
    return true;
  }
}