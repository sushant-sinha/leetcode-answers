// SUSHANT SINHA

// using boolean array to keep the track the of characters
// 60ms ( 17.04% ) 39.1mb ( 49.23% )

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

// using ArraList
// 72ms ( 9.88% ) 39.3mb ( 38.33% )

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
        
        ArrayList<Integer> cont = new ArrayList<>();
        
        for(char c:s.toCharArray()){
            cont.add((int)c);
        }

        
        for(char c:s.toCharArray()){
            if(Character.isLowerCase(c)){
                if(!cont.contains((int)(c-32)))
                    return false;
            }
            else{
                if(!cont.contains((int)(c+32)))
                    return false;
            }
        }
        
        return true;
        
    }
    
}