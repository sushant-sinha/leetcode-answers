// SUSHANT SINHA

// 1ms ( 100% ) 42.4mb

class Solution {
    public int countAsterisks(String s) {
        
        boolean start=false;
        
        int ans=0;
        
        for(char c:s.toCharArray()){
            
            if(c=='|'){
                start=!start;
                continue;
            }
            
            if(!start && c=='*')
                ans++;
            
        }
        
        return ans;
        
    }
}