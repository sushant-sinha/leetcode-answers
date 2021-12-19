// SUSHANT SINHA

// 2ms ( 42.86% ) 39.2mb

class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String s:words){
            
            if(ispalindrome(s))
                return s;
            
        }
        
        return "";
        
    }
    
    boolean ispalindrome(String s){
        
        for(int i=0;i<s.length()/2;i++){
            
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
            
        }
        
        return true;
        
    }
}