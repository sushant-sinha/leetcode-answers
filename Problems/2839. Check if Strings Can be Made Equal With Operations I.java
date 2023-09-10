// SUSHANT SINHA

// what kind of question was this?
// 1ms ( 99.91% ) 41.5mb ( 84.71% )

class Solution {
    public boolean canBeEqual(String s1, String s2) {
        
        if(s1.charAt(0)==s2.charAt(0) && s1.charAt(2)==s2.charAt(2) || s1.charAt(2)==s2.charAt(0) && s1.charAt(0)==s2.charAt(2)){
            if(s1.charAt(1)==s2.charAt(1) && s1.charAt(3)==s2.charAt(3) || s1.charAt(1)==s2.charAt(3) && s1.charAt(3)==s2.charAt(1))
                return true;
        }
        
        return false;
        
    }
}