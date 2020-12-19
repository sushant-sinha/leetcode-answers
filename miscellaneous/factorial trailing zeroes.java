// SUSHANT SINHA

// Least space

class Solution {
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n/5 + trailingZeroes(n/5);
    }
}

// Fastest

class Solution {
    // Time Complexity: O(log5(n)) because we are using base 5.
    // Space Complexity: O(1)

    public int trailingZeroes(int n) {
        int count = 0;
        
        while (n > 4) {
            n /= 5;
            count += n;
        }
        
        return count;
    }
}