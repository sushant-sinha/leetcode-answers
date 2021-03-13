// SUSHANT SINHA

class Solution {
    public int maxPower(String s) {
        
        int ans=1;
        
        for(int i=0;i<s.length()-1;i++){
            
            int temp=1;
                        
            char x=s.charAt(i);
            
            while(i+1!=s.length() && x==s.charAt(++i)){
                temp++;
            }
            
            ans= temp>ans ? temp : ans;
            
            i--;
            
            
        }
        
        return ans;
        
    }
}