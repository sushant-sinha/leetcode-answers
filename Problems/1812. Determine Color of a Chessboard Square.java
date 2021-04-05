// SUSHANT SINHA

class Solution {
    public boolean squareIsWhite(String coordinates) {
        
        char s=coordinates.charAt(0);
        int i=s-'a'+1;
        int j=Character.getNumericValue(coordinates.charAt(1));
        
        return (i+j)%2!=0;
        
    }
}