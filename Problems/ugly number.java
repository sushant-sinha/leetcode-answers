// SUSHANT SINHA

class Solution {
    public boolean isUgly(int num) {
        while (num != 0 && num % 5 == 0) num = num / 5;
        
        while (num != 0 && num % 3 == 0) num = num / 3;
        
        while (num != 0 && num % 2 == 0) num = num / 2;
        
        return num == 1;
    }
}
