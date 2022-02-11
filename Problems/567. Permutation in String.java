// https://leetcode.com/submissions/detail/639389118/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len_s1 = s1.length(), len_s2 = s2.length();
        if (len_s1 > len_s2) return false;
        
        int[] count = new int[26];
        for (int i = 0; i < len_s1; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if (zeroCount(count)) return true;
        
        for (int i = len_s1; i < len_s2; i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - len_s1) - 'a']++;
            if (zeroCount(count)) return true;
        }
        
        return false;
    }
    
    private boolean zeroCount(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) 
                return false;
        }
        return true;
    }
}