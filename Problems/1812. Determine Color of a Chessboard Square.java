// SUSHANT SINHA

// 0ms ( 100% ) 37mb ( 100% )

class Solution {
    public boolean squareIsWhite(String coordinates) {
        
        char s=coordinates.charAt(0);
        int i=s-'a'+1;
        int j=Character.getNumericValue(coordinates.charAt(1));
        
        return (i+j)%2!=0;
        
    }
}