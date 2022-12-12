// SUSHANT SINHA

// 2ms( 83.33% ) 41.5mb ( 83.33% )

class Solution {
    public int maximumValue(String[] strs) {
        
        int ans=0;
        
        for(String s: strs){
            
            boolean isChar=false;
            
            for(char c:s.toCharArray()){
                if(Character.isLetter(c)){
                    isChar=true;
                    break;
                }
            }
            
            if(isChar){
                ans= ans<s.length() ? s.length() : ans;
            }
            
            else
                ans= ans<Integer.parseInt(s) ? Integer.parseInt(s) : ans;
            
        }
        
        return ans;
        
    }
}