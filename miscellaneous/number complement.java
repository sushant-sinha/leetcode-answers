// SUSHANT SINHA

/*

An efficient approach to this problem is as follows:
1. Find the number of bits in the given integer
2. XOR the given integer with 2^number_of_bits-1

*/

class Solution {
    public int findComplement(int n) {
         int number_of_bits = (int)(Math.floor(Math.log(n)/Math.log(2))) + 1; 
  
        // XOR the given integer with poe(2, 
        // number_of_bits-1 and print the result 
        return ((1 << number_of_bits) - 1) ^ n; 
    }
}