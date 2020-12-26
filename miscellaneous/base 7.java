// SUSHANT SINHA

// base 7.java

class Solution {
    public String convertToBase7(int num) {
        
        int abs = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (abs >= 7) {
            sb.append(abs % 7);
            abs /= 7;
        }
        sb.append(abs).reverse();
        
        // Append "-" is num<0
        
        return num >= 0 ? sb.toString() : "-" + sb.toString();
        
        }
}

// one liner

class Solution {
    public String convertToBase7(int num) {

    return Integer.toString(num,7);

    }
}