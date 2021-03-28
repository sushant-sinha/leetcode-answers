// SUSHANT SINHA

class Solution {
    public int countSubstrings(String s) {
        
        int ans=0;
        
        for(int i=0;i<=s.length()-1;i++){
            for(int j=i+1;j<=s.length();j++){
                if(check(s.substring(i,j))){
                    ans++;
                    
                }
            }
        }
        
        return ans;
        
        
    }
    
    boolean check(String s){
        
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        
        return true;
    }
    
}