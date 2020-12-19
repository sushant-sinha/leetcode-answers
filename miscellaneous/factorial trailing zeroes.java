// SUSHANT SINHA

// My answer

class Solution {
    public int trailingZeroes(int n) {
        int fact[]=new int[2];
        for(int i=1;i<=n;i++){
            int j=i;
            while(j%2==0){
                j/=2;
                fact[0]++;
            }
            while(j%5==0){
                j/=5;
                fact[1]++;
            }
        }
        
        return fact[0]>fact[1] ? fact[1] : fact[0];
    }
}

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