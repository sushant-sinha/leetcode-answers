// SUSHANT SINHA

class Solution {
    public int removePalindromeSub(String s) {
        
        if(s.length()==0)return 0;
        if(ispal(s))return 1;
        else return 2;
        
        
    }
    
    public boolean ispal(String s){
        
        for(int i=0;i<s.length()/2;i++){
            
            if(!(s.charAt(i)==s.charAt(s.length()-i-1)))return false;
            
        }
        
        return true;
        
    }
    
}