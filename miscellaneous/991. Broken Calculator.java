// SUSHANT SINHA

// 0ms ( 100% ) 35.8mb ( 45.67% )

/*

Approach 1: Work Backwards
Intuition

Instead of multiplying by 2 or subtracting 1 from X, we could divide by 2 (when Y is even) or add 1 to Y.

The motivation for this is that it turns out we always greedily divide by 2:

If say Y is even, then if we perform 2 additions and one division, 
we could instead perform one division and one addition for less operations [(Y+2) / 2 vs Y/2 + 1].

If say Y is odd, then if we perform 3 additions and one division, 
we could instead perform 1 addition, 1 division, and 1 addition for less operations [(Y+3) / 2 vs (Y+1) / 2 + 1].

*/

class Solution {
    public int brokenCalc(int X, int Y) {
        int ans = 0;
        while (Y > X) {
            ans++;
            if (Y % 2 == 1)
                Y++;
            else
                Y /= 2;
        }

        return ans + X - Y;
    }
}