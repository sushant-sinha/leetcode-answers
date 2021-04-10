// SUSHANT SINHA

class Solution {
    public boolean checkOnesSegment(String s) {
        
        char ar[]=s.toCharArray();
        
        int i=0;
        
        for(;i<s.length();i++){
            
            if(ar[i]=='0')
                break;
            
        }
        
        if(i==s.length()) return true;
        
        for(;i<s.length();i++){
            if(ar[i]=='1')
                return false;
        }
        
        return true;
        
    }
}