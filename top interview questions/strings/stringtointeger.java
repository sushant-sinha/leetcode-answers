// SUSHANT SINHA
class Solution {
    public int myAtoi(String str) {
        if(str == null || str.isEmpty())
            return 0;
        
        int index=0;
        while(index < str.length() && str.charAt(index) == ' ') {
            index++;
        }
        
        if(index >= str.length())
            return 0;
        
        int sign = 1;
        if(str.charAt(index) == '-' || str.charAt(index) == '+') {
            sign = (str.charAt(index++) == '-') ? -1 : 1;
        }
        
        long output = 0;
        while(index < str.length() && str.charAt(index) >= 48 && str.charAt(index) <= 57) {
            output = (output * 10) + (str.charAt(index++) - 48);
            
            if((output * sign) >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if((output * sign) <= Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        return (int)output * sign;
    }
}