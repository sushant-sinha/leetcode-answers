// SUSHANT SINHA

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