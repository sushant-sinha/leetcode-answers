// SUSHANT SINHA

class Solution {
    public String longestNiceSubstring(String s) {
        
        if(s.length()<=1)
            return "";
        
        String ans="";
        
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                String test=s.substring(i,j+1);
                if(check(test))
                    ans = ans.length() >= test.length() ? ans : test; 
            }
            
        }
        
        return ans;
        
    }
    
    boolean check(String s){
        
        boolean lower[]=new boolean[26];
        boolean upper[]=new boolean[26];
        
        for(char c:s.toCharArray()){
            if(Character.isLowerCase(c)){
                lower[c-'a']=true;
            }
            else
                upper[c-'A']=true;
        }
        
        for(char c:s.toCharArray()){
            if(Character.isLowerCase(c)){
                if(!upper[c-'a'])
                    return false;
            }
            else{
                if(!lower[c-'A'])
                    return false;
            }
        }
        
        return true;
        
    }
    
}

