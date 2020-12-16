// SUSHANT SINHA

// Here we just check whether the decimal part of the square root is 0 or not

class Solution {
    public boolean isPerfectSquare(int num) {
     return Math.sqrt(num)-(int)(Math.sqrt(num))==0;
    }
}