// SUSHANT SINHA

// Bit manipulation method....... just ( learn bit manipulation )

class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;
        for (char x : s.toCharArray()) ans ^= x;
        for (char x : t.toCharArray()) ans ^= x;
        return ans;
    }
}