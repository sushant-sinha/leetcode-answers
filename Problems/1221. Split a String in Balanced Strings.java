// SUSHANT SINHA

class Solution {
    public int balancedStringSplit(String s) {
        
        int ans=0;
        
        int l=0,r=0;
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='L')
                l++;
            else
                r++;
            if(l==r){
                ans++;
                l=0;
                r=0;
            }
            
        }
        
        return ans;
        
    }
}