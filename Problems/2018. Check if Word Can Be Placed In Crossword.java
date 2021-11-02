class Solution {
    public boolean placeWordInCrossword(char[][] board, String word) {

        int m = board.length, n = board[0].length;
        char[][] rotated = new char[n][m];
        
        for(int j = 0; j < n; j++)
            for(int i = 0; i < m; i++)
                rotated[j][i] = board[i][j];
        
        return helper(board, word) || helper(rotated, word);
    }
    
    public boolean helper(char[][] board, String word){
        
        String[] words = new String[]{word, new StringBuilder(word).reverse().toString()};
        
        for(char[] row: board){
            
            String[] strs = new String(row).split("#");
            
            for(String wd: words){
                for(String str: strs){
                    if(str.length() == wd.length()){
                        int w = 0;
                        while(w < str.length() && (str.charAt(w) == ' ' || str.charAt(w) == wd.charAt(w))){
                            w++;
                        }

                        if(w == str.length())
                            return true;
                    }
                }                
            }
        }
        
        return false;        
    }
}