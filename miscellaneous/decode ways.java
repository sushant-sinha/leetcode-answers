// SUSHANT SINHA

/**
 * Approach: DP
 * This question is a bit similar to Climbing Stairs.
 * We can consider this problem from a recursive direction, so that it may go smoothly.
 * When solving recursively, we can remove the current character or two characters to decode.
 * If it can be decoded correctly, the current method number is the sum of the method numbers in these two cases. Then continue to decode the remaining strings.
 * Because this is a problem with no aftereffect, we can use DP to solve it.
 * Of course, you can also use recursive + memoized search, the effect is the same (rather than saying that this is actually DP)
 *
 * dp[i] means: the number of decoding methods in the first i characters.
 * It depends on dp[i-1] and dp[i-2].
 * We only need to analyze separately: take the case of decoding one character and the case of decoding two characters.
 * If it can be decoded correctly, add the corresponding method number.
 * Here we need to explain about initialization:
 * dp[0] is initialized to 1, which means that when the string is empty, there is also a decoding.
 * For example: "10234", dp[2] = dp[0] = 1
 * Because at this time when we take 1 character, it cannot be decoded correctly.
 *
 * Time complexity: O(n) (note that do not use subString() when fetching characters, otherwise the time and space complexity will rise to O(n^2))
 * Space complexity: O(n) (can be optimized to O(1) by using rolling array)
 *


 * Video explanation:
 * https://www.youtube.com/watch?v=OjEHST4SXfE

 */

 class Solution {
    public int numDecodings(String s) {
        
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int len = s.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= len; i++) {
            
            int oneChar = s.charAt(i - 1) - '0';
            int twoChar = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
            if (1 <= oneChar) {
                dp[i] += dp[i - 1];
            }
            
            if (twoChar >= 10 && twoChar <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[len];
    }
}