// SUSHANT SINHA

// 64ms ( 56.09% ) 44.06mb ( 74.78% )

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                StringBuilder pattern = new StringBuilder();
                for (int j = 0; j < n / i; j++) {
                    pattern.append(s.substring(0, i));
                }
                if (s.equals(pattern.toString())) {
                    return true;
                }
            }
        }
        return false;
    }
}