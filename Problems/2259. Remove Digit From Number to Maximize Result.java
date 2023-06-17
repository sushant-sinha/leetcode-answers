// SUSHANT SINHA

// edit before pushing
// 1ms ( 98.02% ) 42.3mb ( 71.70% )

class Solution {
    public String removeDigit(String number, char digit) {
        
        char[] chars = number.toCharArray();
        // StringBuffer?
        StringBuilder str = new StringBuilder(number);
        int index = -1;
        
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == digit && chars[i] < chars[i + 1]) {
                index = i;
                break;
            }
        }
        
        if (index == -1)
            return str.deleteCharAt(number.lastIndexOf(digit)).toString();
        
        else
            return str.deleteCharAt(index).toString();
        
    }
}