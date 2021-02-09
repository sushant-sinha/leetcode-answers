// SUSHANT SINHA

class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        
        int lines = 1, width = 0;
        
        char ar[]=S.toCharArray();
        
        for (char c: ar) {
            
            int w = widths[c - 'a'];
            width += w;
            if (width > 100) {
                lines++;
                width = w;
                
            }
        }

        return new int[]{lines, width};
    }
}