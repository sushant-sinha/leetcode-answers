// SUSHANT SINHA

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        if(s1.equals(s2))return true;
        
        int prev=0,ck=0,ans=0;
        
        for(int i=0;i<s1.length();i++){
            
            if(s1.charAt(i)!=s2.charAt(i)){
                
                ck++;
                
                if(ck==1)
                    prev=i;
                if(ck==2 && s1.charAt(prev)==s2.charAt(i) && s2.charAt(prev)==s1.charAt(i)){
                    ans++;
                }
                if(ck>2) return false;
                
            }
            
        }
        
        return ans==1;
    }
}