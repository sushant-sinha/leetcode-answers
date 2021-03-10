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


// Bit masking

class Solution {
    public int findComplement(int num) {
        int c = 0, t = num;
		//First, you need to find how many bits are present in the given number.
        while(t>0) {
            t = t>>1;
            c++;
        }
		//Now after that, create a mask of 1's about the size of num.
		//eg: if num = 5(101) then mask = 7(111) 
        int mask = (1<<(c))-1;
		//now this mask can be used to flip all the bits in num using XOR.
        return num^mask;
    }
}