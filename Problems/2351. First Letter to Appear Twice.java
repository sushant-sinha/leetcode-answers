class Solution {
    public char repeatedCharacter(String s) {
        
        byte ar[]=new byte[26];
        
        for(char c: s.toCharArray()){
            
            if(ar[c-'a']==1)
                return c;
            
            else
                ar[c-'a']++;
            
        }
        
        return ' ';
        
    }
}