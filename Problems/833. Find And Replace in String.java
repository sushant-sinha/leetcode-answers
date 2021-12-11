// referenced

// 1ms ( 99.31% ) 39.4mb ( 34.48% )

Runtime: 0 ms, faster than 100.00% of Java online submissions for Find And Replace in String.
Memory Usage: 38.7 MB, less than 94.18% of Java online submissions for Find And Replace in String.
Next challenges:
Verifying an Alien Dictionary
Diet Plan Performance
Minimum Number of Taps to Open to Water a Garden
Show off your acceptance:


class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        String[] pieces = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            pieces[i] = s.substring(i, i + 1);
        }
        for (int i = 0; i < indices.length; i++) {
            if (sources[i].equals(s.substring(indices[i], indices[i] + sources[i].length()))) {
                pieces[indices[i]] = targets[i];
                for (int j = 0; j < sources[i].length() - 1; j++) {
                    pieces[indices[i] + 1 + j] = null;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i] != null) sb.append(pieces[i]);
        }
        return sb.toString();
    }
}