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

// best solution
// 0ms ( 100% ) 38.7mb ( 94.18% )

class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int len = s.length();
        int n = sources.length;
        int[] arr = new int[s.length()];
        Arrays.fill(arr, -1);
        
        for(int i=0;i<n;i++){
            //                  "a"         0         arr[0] = 0
            //                  "cd"        2         arr[2] = 1
            if (s.startsWith(sources[i], indices[i])) arr[indices[i]]=i;
        }
        // s="abcd", arr = [0,-1,1,-1]
        StringBuilder sb = new StringBuilder();
        int p = 0;
        while(p<len){
            int idx = arr[p];
            if (idx>=0){
                sb.append(targets[idx]);
                p+=sources[idx].length();
            } else {
                sb.append(s.charAt(p));
                p++;
            }
        }
        
        return sb.toString();
    }
}
