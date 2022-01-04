class Solution {
    public boolean checkString(String s) {
        
        int bStarted=0;
        
        for(char c: s.toCharArray()){
            
            if(c=='b')
                bStarted=1;
            
            if(bStarted==1 && c=='a')
                return false;
            
        }
        
        return true;
        
    }
}