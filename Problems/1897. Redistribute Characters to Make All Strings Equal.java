class Solution {
    public boolean makeEqual(String[] words) {
        
        int count[]=new int[26];
        
        for(String s:words){
            
            for(char c:s.toCharArray())
                count[c-'a']++;
            
        }
        
        for(int i=0;i<count.length;i++){
            
            if(count[i]!=0){
                if(count[i]%words.length!=0)
                    return false;
            }
            
        }
        
        return true;
        
        
    }
}