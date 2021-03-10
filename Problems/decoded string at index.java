// SUSHANT SINHA

// Given in LeetCode solution 

class Solution {
    public String decodeAtIndex(String S, int K) {
        long size = 0;
        int N = S.length();

        // Find size = length of decoded string
        for (int i = 0; i < N; ++i) {
            char c = S.charAt(i);
            if (Character.isDigit(c))
                size *= c - '0';
            else
                size++;
        }

        for (int i = N-1; i >= 0; --i) {
            char c = S.charAt(i);
            K %= size;
            if (K == 0 && Character.isLetter(c))
                return Character.toString(c);

            if (Character.isDigit(c))
                size /= c - '0';
            else
                size--;
        }

        throw null;
    }
}

// took from https://github.com/gouthampradhan/leetcode/blob/master/problems/src/math/DecodedStringAtIndex.java

class Solution {
    public String decodeAtIndex(String S, int K) {
    long product = 0;
    char lastC = S.charAt(0);
    for (int i = 0, l = S.length(); i < l; ) {
      char c = S.charAt(i);
      if (Character.isLetter(c)) {
        lastC = c;
        product++;
        i++;
        if (K == product) break;
      } else {
        long temp = (product * Integer.parseInt(String.valueOf(c)));
        if (temp == K) break;
        else {
          if (temp > K) {
            long x = (K / product);
            if ((product * x) == K) break;
            K -= (product * x);
            i = 0;
            product = 0;
          } else {
            product = temp;
            i++;
          }
        }
      }
    }
    return String.valueOf(lastC);
  }
}