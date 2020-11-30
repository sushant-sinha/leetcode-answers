// SUSHANT SINHA
class Solution {
    public int divide(int dividend, int divisor) {
        // Corner case: 
        // dividend = -2147483648 and divisor = -1, answer should be 2147483647, otherwise it will overflow.
        if(divisor == -1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
        
        // Work only with positive representations for now, we'll put the sign at the end.
        // NOTE: 
        // Casting to long is necessary otherwise Math.abs(Integer.MIN_VALUE) 
        // returns Integer.MIN_VALUE since 32-bit signed integers overflow
        long lDividend = Math.abs((long) dividend);
        long lDivisor = Math.abs((long) divisor);
        
        /**
         * KEY INSIGHT:  
         * Every integer lDividend can be represented in terms of lDivisor and powers of 2 as follows,
         * lDividend = c + lDivisor * Math.pow(2, n) + lDivisor * Math.pow(2, m) + .... +
         *               + ... + lDivisor * Math.pow(2, 0)
         * where, 
         * c is the remainder and c < lDivisor, 
         * n is the highest power of 2 such that lDivisor * Math.pow(2,n) <= lDividend,
         * m is the second highest power of 2 such that lDivisor * Math.pow(2,m) <= lDividend and so on.
         * 
         * Since every integer has such a binary representation, we can successively reduce lDividend by amount 
         * equal to (lDivisor * Math.pow(2, highestPowerOfTwo)) until lDividend becomes c. 
         * 
         * This way our search for the quotient can finish in O(log N) time.
         */
        int quotient = 0;
        int highestPowerOfTwo = 0;
        // NOTES ON SOME BIT HACKS: 
        // 1. x << n is equivalent to x * Math.pow(2, n). (<< is Leftshift Operator)
        // 2. 1 << x is equivalent to Math.pow(2, x). (<< is Leftshift Operator)
        // 3. x and y have opposite signs if (x ^ y) < 0. (^ is Bitwise XOR)
        while(lDividend >= lDivisor){
            highestPowerOfTwo = 0;
            // Keep finding the highest number such that (lDivisor * Math.pow(2, highestPowerOfTwo)) <= lDividend
            while(lDividend >= (lDivisor << highestPowerOfTwo)) highestPowerOfTwo++;
            
            // Latest highestPowerOfTwo took lDivisor higher than lDividend, so contend with (highestPowerOfTwo - 1)
            highestPowerOfTwo = highestPowerOfTwo - 1;
            
            // Add the highestPowerOfTwo to our result.
            quotient += 1 << highestPowerOfTwo;
            // Reduce lDividend by amount (lDivisor * Math.pow(2, highestPowerOfTwo))
            lDividend -= (lDivisor << highestPowerOfTwo);
        }
        // If dividend and divisor had opposite signs, then sign of the result is negative.
        // Otherwise, sign of the result is positive.
        return ((dividend ^ divisor) < 0) ? -quotient : quotient;
    }
}