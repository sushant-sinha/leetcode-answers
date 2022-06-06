// SUSHANT SINHA

// 1ms ( 97.89% ) 38.9mb ( 94.55% )

/*

the solution is same as that of N-Queens... all we need to do here is to return the size of the solution array
this is because the solution set is always unique, so we can simply return the size of the List

*/

class Solution {
    private List<List<String>> res;
    private int N;

    public int totalNQueens(int n) {
        res = new ArrayList<>();
        N = n;
        char[][] emptyBoard = new char[N][N];
        for (char[] row: emptyBoard) Arrays.fill(row, '.');
        
        backtrack(emptyBoard, 0, 0, 0, 0);
        return res.size();
    }
    
    private void backtrack(char[][] board, int row, int cols, int diags, int antiDiags) {
        // if we've successfuly placed a Queen at all rows, we have a valid board state
        if (row == N) {
            res.add(toBoard(board));
            return;
        }
        
        for (int col=0; col<N; col++) {
            int currDiag = row-col+N;
            int currAntiDiag = row+col;
            
            // check if the current Queen placement is valid
            if ((cols & (1 << col)) != 0 || (diags & (1 << currDiag)) != 0 || (antiDiags & (1 << currAntiDiag)) != 0) continue;
            
            // if so, add changes
            board[row][col] = 'Q';
            cols |= (1 << col);
            diags |= (1 << currDiag);
            antiDiags |= (1 << currAntiDiag);
            
            // continue to the next row
            backtrack(board, row + 1, cols, diags, antiDiags);
            
            // undo changes and continue
            board[row][col] = '.';
            cols ^= (1 << col);
            diags ^= (1 << currDiag);
            antiDiags ^= (1 << currAntiDiag);
        }
    }
    
    private List<String> toBoard(char[][] board) {
        List<String> newBoard = new ArrayList<>();
        for (char[] row: board) newBoard.add(new String(row));
        return newBoard;
    }
}