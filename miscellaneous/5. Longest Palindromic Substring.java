// SUSHANT SINHA


// my brute force solution TLE

class Solution {
    public String longestPalindrome(String s) {
        
        String ans="";
        
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                
                String sub=s.substring(i,j);
                
                if(ispalin(sub) && ans.length()<=sub.length()){
                    ans=sub;
                    if(ans.length()==s.length())return ans;
                }
                
            }
        }
        
        return ans;
        
    }
    
    static boolean ispalin(String sub){
        
        if(sub.length()==1)return true;
        
        for(int i=0;i<sub.length()/2;i++){
            
            if(!sub.substring(i,i+1).equals(sub.substring(sub.length()-i-1,sub.length()-i)))return false;
            
        }
        
        return true;
        
    }
}

// 23 ms ( 38.7mb ) given solution for expand around center

public String longestPalindrome(String s) {
    if (s == null || s.length() < 1) return "";
    int start = 0, end = 0;
    for (int i = 0; i < s.length(); i++) {
        int len1 = expandAroundCenter(s, i, i);
        int len2 = expandAroundCenter(s, i, i + 1);
        int len = Math.max(len1, len2);
        if (len > end - start) {
            start = i - (len - 1) / 2;
            end = i + len / 2;
        }
    }
    return s.substring(start, end + 1);
}

private int expandAroundCenter(String s, int left, int right) {
    int L = left, R = right;
    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
        L--;
        R++;
    }
    return R - L - 1;
}

// 23ms ( 39.2mb )  dynamic programming

class Solution {
    int maxLen = 0, start = 0;
    
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        
        for (int i = 0; i < s.length(); i++) {
            // odd
            expandFromMiddle(s, i, i);
            
            // even
            expandFromMiddle(s, i, i + 1);
        }
        
        return s.substring(start, start+maxLen);
    }
    
    private void expandFromMiddle(String s, int lo, int hi) {        
        while (lo >= 0 && hi < s.length() && s.charAt(lo) == s.charAt(hi)) {
            lo--;
            hi++;
        }
        
        int len = hi - lo - 1;
        
        if (len > maxLen) {
            maxLen = len;
            start = lo + 1;
        }
    }
}