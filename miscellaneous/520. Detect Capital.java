// SUSHANT SINHA

class Solution {
    public boolean detectCapitalUse(String word) {
        
        char ch[]=word.toCharArray();
        if(ch.length>1){
            
            if(Character.isUpperCase(ch[0]) && Character.isUpperCase(ch[1])){
                
                for(int i=2;i<ch.length;i++){
                    if(!Character.isUpperCase(ch[i]))return false;
                }
                
            }
            
            if(Character.isUpperCase(ch[0]) && !Character.isUpperCase(ch[1])){
                
                for(int i=2;i<ch.length;i++){
                    if(Character.isUpperCase(ch[i]))return false;
                }                
            
            }
            
            if(!Character.isUpperCase(ch[0])){
                for(int i=1;i<ch.length;i++){
                    if(Character.isUpperCase(ch[i]))return false;
                }
            }
            
        }
        
        return true;
        
    }
}