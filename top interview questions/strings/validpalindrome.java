// SUSHANT SINHA
class Solution {
    public boolean isPalindrome(String s) {
        if(s == null) return false;
        if(s.equals("")) return true;
        s = s.toLowerCase();
        int f = -1;
        int e = s.length();
        boolean is = true;
        while(f < e){
            while(!Character.isLetter(s.charAt(++f)) && !Character.isDigit(s.charAt(f)) && f < s.length() - 1);
            while(!Character.isLetter(s.charAt(--e)) && !Character.isDigit(s.charAt(e)) && e > 0);
            
            if(!Character.isLetter(s.charAt(e)) && !Character.isDigit(s.charAt(e))
                && !Character.isLetter(s.charAt(f)) && !Character.isDigit(s.charAt(f))) break;
            else if(s.charAt(f) != s.charAt(e)){
                is = false;
                break;
            }  
        }
        return is;
        
    }
}