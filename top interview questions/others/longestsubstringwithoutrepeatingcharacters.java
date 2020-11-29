// SUSHANT SINHA

// Can also be done using arraylist

class Solution {

 public int lengthOfLongestSubstring(String s) {
        int l=0, r=0, max = 0;
        boolean[] window = new boolean[256];
        while(r<s.length()) {
            char c = s.charAt(r);
            while(window[c]) {
                max = Math.max(max, r-l);
                window[s.charAt(l)]=false;
                l++;    
            }
            window[c] = true;
            r++;
        }
        return Math.max(max,r-l);
 }
}