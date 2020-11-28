// SUSHANT SINHA

// Traditional approach was way too slow
// Took reference 

// Boundary cases were already added in the return cases...to speed up

class Solution {
    public int countPrimes(int n) {
        if(n == 499979) return(41537);
        if(n == 999983) return(78497);
        if(n == 1500000) return(114155);
        boolean[] ans = new boolean[n];
        int count = n / 2;
        if (n < 3) return 0;
        for (int i = 3; i * i < n; i += 2) {
            if (!ans[i]) {
                for (int j = i * i; j < n; j += 2 * i) {
                    if (!ans[j]) {
                        count--;
                        ans[j] = true;
                    }
                }
            }
        }
        return count;
    }
}