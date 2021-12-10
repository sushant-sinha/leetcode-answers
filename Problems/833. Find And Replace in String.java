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