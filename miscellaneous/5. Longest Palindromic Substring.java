// SUSHANT SINHA

// my brute force solution TLE

class Solution {
    public String longestPalindrome(String s) {
        
        String ans="";
        
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                
                String sub=s.substring(i,j);
                
                if(ispalin(sub) && ans.length()<=sub.length()){
                    ans=sub;
                    if(ans.length()==s.length())return ans;
                }
                
            }
        }
        
        return ans;
        
    }
    
    static boolean ispalin(String sub){
        
        if(sub.length()==1)return true;
        
        for(int i=0;i<sub.length()/2;i++){
            
            if(!sub.substring(i,i+1).equals(sub.substring(sub.length()-i-1,sub.length()-i)))return false;
            
        }
        
        return true;
        
    }
}
