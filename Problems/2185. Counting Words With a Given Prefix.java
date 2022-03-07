class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int ans=0, len=pref.length();
        
        boolean flag=false;
        
        for(String s:words){
            
            flag=true;
            
            if(s.length()<len)
                continue;
            
            for(int i=0;i<len;i++){
                if(s.charAt(i)!=pref.charAt(i)){
                    flag=false;
                    break;
                }
            }
            
            if(flag)
                ans++;
            
        }
        
        return ans;
        
    }
}