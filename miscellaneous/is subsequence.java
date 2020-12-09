// SUSHANT SINHA

class Solution {
    public boolean isSubsequence(String s, String t) {
    	int i = 0;
    	while (!s.equals("")) {
    		char f = s.charAt(0);
    		int x = t.substring(i).indexOf(f);
    		if (x == -1) break;
    		i = i + x + 1;
    		s = s.substring(1);
    	}
    	if (s.equals("")) return true;
    	return false;
    }
}