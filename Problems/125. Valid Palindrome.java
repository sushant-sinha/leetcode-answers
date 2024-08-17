// SUSHANT SINHA

// 6ms ( 44.61% ) 48.31mb ( 5.50% )
// part of TUF recursion

class Solution {
    public boolean isPalindrome(String s) {

        StringBuffer sb=new StringBuffer();

        for(char c:s.toCharArray()){

            if(Character.isLetter(c) || Character.isDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        // System.out.println(sb);

        return isRecurPalindrome(sb, 0, sb.length());
        
    }

    boolean isRecurPalindrome(StringBuffer sb, int curIndex, int len){

        if(curIndex==len/2)
            return true;

        if(sb.charAt(curIndex)!=sb.charAt(len-curIndex-1))
            return false;

        else{
            boolean rightCheck=isRecurPalindrome(sb, curIndex+1, len);

            return true && rightCheck;
        }
    }
}

// solution from Nov 24, 2020😂

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